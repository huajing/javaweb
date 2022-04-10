package spring;

import anno.MyAutoware;
import anno.MyComponet;
import anno.MyScope;
import spring.aware.BeansException;
import spring.aware.MyBeanNameAware;
import spring.aware.MyBeanPostProcessor;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Enumeration;
import java.util.Set;

public class MyAnnatationSpringContext extends MySpringContext {
    private String packagePath;

    public MyAnnatationSpringContext(String packagePath){
        this.packagePath = packagePath;

        this.refresh();
    }

    private void refresh(){
        try {
            //加载bean的定义
            this.initBeanDefinition();
            //初始化bean
            this.initBeans();
            //依赖注入
            this.autoware();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void initBeans() throws IllegalAccessException, InstantiationException{
        Set<String> keySet = beanDefinitionMap.keySet();
        for (String key : keySet) {

            if(beanMap.containsKey(key))continue;

            MyBeanDefinition beanDefinition = beanDefinitionMap.get(key);
            Object o = beanDefinition.getClazz().newInstance();
            beanMap.put(key, o);

            if(o instanceof MyBeanNameAware){
                MyBeanNameAware myBeanNameAware = (MyBeanNameAware)o;
                myBeanNameAware.setBeanName(key);
            }

            if(o instanceof MyBeanPostProcessor){
                beanPostProcessorList.add((MyBeanPostProcessor) o);
            }
        }
    }

    @Override
    protected void initBeanDefinition() {
        try {
            ClassLoader classLoader = this.getClass().getClassLoader();
            String path = packagePath.replaceAll("[.]", "/");
            Enumeration<URL> resources = classLoader.getResources(path);
            while (resources.hasMoreElements()){
                URL url = resources.nextElement();
                this.recursionBeans(new File(url.getPath()));
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void recursionBeans(File file) throws ClassNotFoundException{
        File[] list = file.listFiles();
        for (File f : list) {
            if(f.isDirectory()){
                recursionBeans(f);
            }else {
                String path = f.getPath().replaceAll(File.separatorChar + "" + File.separatorChar, ".");
                path = path.substring(path.indexOf(packagePath), path.lastIndexOf('.'));

                Class<?> aClass = Class.forName(path);
                if(aClass.isAnnotationPresent(MyComponet.class)) {
                    MyBeanDefinition df = new MyBeanDefinition();
                    df.setClazz(aClass);
                    if(aClass.isAnnotationPresent(MyScope.class)){
                        MyScope annotation = aClass.getAnnotation(MyScope.class);
                        df.setScope(annotation.value());
                    }
                    beanDefinitionMap.put(aClass.getName(), df);
                }
            }
        }
    }

    private void autoware() throws IllegalAccessException {
        Set<String> keySet = beanDefinitionMap.keySet();
        for (String key : keySet) {
            MyBeanDefinition beanDefinition = beanDefinitionMap.get(key);
            Class aClass = beanDefinition.getClazz();
            Field[] fields = aClass.getDeclaredFields();

            for (Field field : fields) {
                if(field.isAnnotationPresent(MyAutoware.class)){
                    Object o = beanMap.get(aClass.getName());//原对象

                    Class<?> type = field.getType();
                    Object fieldObj = beanMap.get(type.getName());//filed对象
                    field.setAccessible(true);
                    field.set(o, fieldObj);//依赖注入
                }
            }
        }
    }
}
