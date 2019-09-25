package c.c.k.thread;

import org.junit.Test;

/**
 * 1、创建线程的方法1：实现Runnable接口，作为Thread的构造参数，然后调用start
 */
public class Runnable_1 {
    class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("一个新的线程创建成功" + Thread.currentThread());
        }
    }
    @Test
    public void testRunnable(){
        System.out.println("main thread is " + Thread.currentThread());
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
    }
}
