package c.c.k.mybatis;

import c.c.k.enums.MyMapperScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description spring的扩展点，给用户自己注册BeanDifinition
 * @Author chenck
 * @Date 2022/4/16 13:50
 * @Version 1.0
 **/

public class MyMapperScannerRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware {
    private ResourceLoader resourceLoader;
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AnnotationAttributes annoAttrs = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(MyMapperScan.class.getName()));
        String packageVal = annoAttrs.getString("value");

        MyClassPathMapperScanner scanner = new MyClassPathMapperScanner(registry);
        scanner.registFilter();
        scanner.scan(packageVal);

        /*BeanDefinition definition = new RootBeanDefinition(MyMapperFactoryBean.class);
        definition.getConstructorArgumentValues().addGenericArgumentValue(UserMapper.class);
        registry.registerBeanDefinition("userMapper", definition);
        System.out.println(importingClassMetadata);*/
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
