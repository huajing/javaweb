package c.c.k.mybatis;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Set;

/**
 * @Description 实现对MapperScan配置包中的扫描
 * @Author chenck
 * @Date 2022/4/16 17:24
 * @Version 1.0
 **/

public class MyClassPathMapperScanner extends ClassPathBeanDefinitionScanner {
    public MyClassPathMapperScanner(BeanDefinitionRegistry registry) {
        super(registry);
    }

    public void registFilter(){
        this.addIncludeFilter((m,f)->true);
    }

    @Override
    protected Set<BeanDefinitionHolder> doScan(String... basePackages) {
        Set<BeanDefinitionHolder> set = super.doScan(basePackages);
        for (BeanDefinitionHolder holder : set) {
            GenericBeanDefinition definition = (GenericBeanDefinition) holder.getBeanDefinition();
            definition.getConstructorArgumentValues().addGenericArgumentValue(definition.getBeanClassName());
            definition.setBeanClass(MyMapperFactoryBean.class);
        }

        return set;
    }

    @Override
    protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
        return true;
    }
}
