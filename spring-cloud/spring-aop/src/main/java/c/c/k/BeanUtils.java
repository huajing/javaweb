package c.c.k;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Title c.c.k
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/7/12 chenck
 */
@Component
public class BeanUtils implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        String[] bean = applicationContext.getBeanDefinitionNames();
        System.err.print("------------------------------------>");
        for(int i = 0;i<bean.length;i++){
            System.err.println(bean[i]);
        }
        System.err.print("------------------------------------>");
    }
}
