package c.c.k.spring.design;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/2 16:08
 * @Version 1.0
 * 工厂模式
 **/

public class BeanFactory {
    /**
     * 静态工厂方法
     */
    public static MyBean createBean(){
        return new MyBean();
    }

    public static void main(String[] args) {
        MyBean bean = BeanFactory.createBean();
        bean.doSomething();
    }
}
