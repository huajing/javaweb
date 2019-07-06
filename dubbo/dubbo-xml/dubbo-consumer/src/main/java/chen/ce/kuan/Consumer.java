package chen.ce.kuan;

import c.c.k.api.IDemoService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"D:\\IdeaProjects\\javaweb\\dubbo\\dubbo-xml\\dubbo-consumer\\src\\main\\resources\\consumer.xml"});
        context.start();
        IDemoService demoService = (IDemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world this is consumer"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
