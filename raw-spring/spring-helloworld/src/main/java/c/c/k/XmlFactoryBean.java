package c.c.k;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.HashMap;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/16 chenck
 */
public class XmlFactoryBean {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        System.out.println(factory.getBean("helloworld").hashCode());
    }
}
