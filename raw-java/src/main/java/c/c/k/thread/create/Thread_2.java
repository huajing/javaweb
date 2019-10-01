package c.c.k.thread.create;

import org.junit.Test;

/**
 *
 */
public class Thread_2 {
    
    class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("一个新的线程创建成功" + Thread.currentThread());
        }
    }

    @Test
    public void testRunnable(){
        System.out.println("main thread is " + Thread.currentThread());
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }

}
