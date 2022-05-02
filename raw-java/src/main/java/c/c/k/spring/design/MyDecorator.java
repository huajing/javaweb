package c.c.k.spring.design;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/2 16:56
 * @Version 1.0
 * 装饰器模式,相比生成子类更为灵活,主要使用组合模式
 *
 **/

public class MyDecorator {
    public static void main(String[] args) {
        Decorator3 decorator3 = new Decorator3(new Decorator2(new Decorator1()));
        decorator3.whatCanIDo();
    }
}
