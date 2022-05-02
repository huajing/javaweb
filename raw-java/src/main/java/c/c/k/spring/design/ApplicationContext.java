package c.c.k.spring.design;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/2 16:21
 * @Version 1.0
 * 观察者模式--被观察者
 **/

public class ApplicationContext {
    private ApplicationListener listener;

    public void addListener(ApplicationListener listener){
        this.listener = listener;
    }

    public void doSomething(){
        //code here....
        //通知观察者
        listener.event();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.addListener(()->{
            //观察到事件发生
        });
        //做事情
        applicationContext.doSomething();
    }
}
