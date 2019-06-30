package c.c.k.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(new String[] {"D:\\IdeaProjects\\javaweb\\dubbo\\dubbo-xml\\dubbo-producer\\src\\main\\resources\\provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
