import c.c.k.MyBean;
import c.c.k.controller.MyController;
import c.c.k.service.MyBeanService;
import c.c.k.service.impl.MyBeanServiceImpl;
import spring.MyAnnatationSpringContext;
import spring.MySpringContext;

//@MyPagecageScan(value = "")
public class TestSpring {
    public static void main(String[] args) {
        /*spring.MySpringContext context = new spring.MySpringContext();
        Object bean1 = context.getBean(MyBean.class);
        System.out.println(bean1);*/

        MySpringContext context = new MyAnnatationSpringContext("c.c.k");

        MyBean bean3 = (MyBean)context.getBean(MyBean.class);
        bean3.print();

        MyController bean = (MyController)context.getBean(MyController.class);
        bean.print();

        MyBeanService bean1 = (MyBeanService)context.getBean(MyBeanService.class);
        bean1.print();

        MyBeanServiceImpl bean2 = (MyBeanServiceImpl)context.getBean(MyBeanServiceImpl.class);
        bean2.print();
    }
}