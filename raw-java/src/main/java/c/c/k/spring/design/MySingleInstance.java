package c.c.k.spring.design;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/2 16:06
 * @Version 1.0
 * 单例模式 DCL
 **/

public class MySingleInstance {
    private static volatile MySingleInstance instance;

    public static MySingleInstance getInstance(){
        if(instance == null){
            synchronized (MySingleInstance.class){
                if(instance == null){
                    instance = new MySingleInstance();
                }
            }
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("doSomething");
    }


    public static void main(String[] args) {
        MySingleInstance instance = MySingleInstance.getInstance();
        instance.doSomething();
    }
}
