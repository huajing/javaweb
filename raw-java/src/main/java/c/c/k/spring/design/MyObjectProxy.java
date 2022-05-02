package c.c.k.spring.design;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/2 16:11
 * @Version 1.0
 * 代理模式代理类: 目的是增加代理对象，或者做AOP
 * 在spring中主要使用jdk的动态代理（有接口）或者CGLIB代理（无接口时）
 **/

public class MyObjectProxy {
    private MyObject myObject;

    public MyObjectProxy(MyObject myObject){
        this.myObject = myObject;
    }

    public void print(){
        System.out.println("before proxy");
        myObject.print();
        System.out.println("after proxy");
    }

    public static void main(String[] args) {
        MyObject myObject = new MyObject();

        //代理对象
        MyObjectProxy proxy = new MyObjectProxy(myObject);
        proxy.print();
    }
}
