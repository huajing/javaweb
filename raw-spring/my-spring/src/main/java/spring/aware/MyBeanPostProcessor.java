package spring.aware;

public interface MyBeanPostProcessor {
    /**
     *
     * @param bean
     * @param beanName
     * @return 初始化前的对象
     * @throws BeansException
     */
    default Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    /**
     *
     * @param bean 容器中的bean对象
     * @param beanName 容器中bean对象的名字
     * @return 初始化给定的对象，以及调整后的对象
     * @throws BeansException
     */
    default Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
