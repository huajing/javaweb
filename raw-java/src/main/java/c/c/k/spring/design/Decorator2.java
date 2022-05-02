package c.c.k.spring.design;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/2 16:59
 * @Version 1.0
 **/

public class Decorator2{
    private Decorator1 decorator1;
    public Decorator2(Decorator1 decorator1){
        this.decorator1 = decorator1;
    }

    public void whatCanIDo() {
        decorator1.whatCanIDo();
        System.out.println("i can drink");
    }
}
