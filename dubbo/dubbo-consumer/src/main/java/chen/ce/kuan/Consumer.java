package chen.ce.kuan;

import chen.ce.kuan.api.DemoService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"D:\\IdeaProjects\\javaweb\\dubbo\\dubbo-consumer\\src\\main\\resources\\consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world this is consumer"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
