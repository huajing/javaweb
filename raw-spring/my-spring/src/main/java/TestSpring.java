import c.c.k.service.MyService;
import c.c.k.service.impl.MyServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import spring.MyAnnatationSpringContext;
import spring.MyMethodInterceptor;
import spring.MySpringContext;
import util.CglibUtil;

//@MyPagecageScan(value = "")
public class TestSpring {
    public static void main(String[] args) {
        MySpringContext context = new MyAnnatationSpringContext("c.c.k");

        /*MyService bean = (MyService)context.getBean(MyServiceImpl.class);
        bean.test();*/


        MyServiceImpl service = (MyServiceImpl)CglibUtil.getObject(MyServiceImpl.class);
        service.test();


        /*MyBean bean3 = (MyBean)context.getBean(MyBean.class);
        bean3.print();

        MyController bean = (MyController)context.getBean(MyController.class);
        bean.print();

        MyBeanService bean1 = (MyBeanService)context.getBean(MyBeanService.class);
        bean1.print();

        MyBeanServiceImpl bean2 = (MyBeanServiceImpl)context.getBean(MyBeanServiceImpl.class);
        bean2.print();*/
    }
}
