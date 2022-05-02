package c.c.k.spring.design;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/2 16:59
 * @Version 1.0
 **/

public class Decorator3{
    private Decorator2 decorator2;
    public Decorator3(Decorator2 decorator2){
        this.decorator2 = decorator2;
    }

    public void whatCanIDo() {
        decorator2.whatCanIDo();
        System.out.println("i can sleep");
    }
}
