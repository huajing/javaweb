package spring;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyAnnatationSpringContext extends MySpringContext {
    private String packagePath;

    public MyAnnatationSpringContext(String packagePath){
        this.packagePath = packagePath;
        this.initBeans();
    }

    @Override
    protected void initBeans() {
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

    private void recursionBeans(File file) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        File[] list = file.listFiles();
        for (File f : list) {
            if(f.isDirectory()){
                recursionBeans(f);
            }else {
                String path = f.getPath().replaceAll(File.separatorChar + "" + File.separatorChar, ".");
                path = path.substring(path.indexOf(packagePath), path.lastIndexOf('.'));

                String beanName = path.substring(path.lastIndexOf('.') + 1);
                Object o = Class.forName(path).newInstance();
                beanMap.put(beanName, o);
            }
        }
    }
}
