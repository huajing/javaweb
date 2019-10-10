package c.c.k.thread;

public class ThreadLocalTest extends Thread{
    private static ThreadLocal<Object> threadLocal = new ThreadLocal();//各个线程自己用自己的数据

    public static void main(String[] args) {
        new ThreadLocalTest().start();
        new ThreadLocalTest().start();
        new ThreadLocalTest().start();
        new ThreadLocalTest().start();
    }

    @Override
    public void run() {
        Object object = threadLocal.get();
        if(object == null){
            threadLocal.set(new Object());
        }
    }
}
