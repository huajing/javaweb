package c.c.k.thread.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 2个线程交替打印
 */
public class PrintEachother_3 {
    private static Thread thread1 = new Thread(new MyRunnable(), "one-thread");
    private static Thread thread2 = new Thread(new MyRunnable(), "two-thread");

    public static void main(String[] args) {
        thread1.start();
        thread2.start();
    }

    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            print();
        }
    }

    private static void print(){
        while (true) {
            try {
                Thread.sleep(1000);
                LockSupport.unpark(Thread.currentThread().equals(thread1) ? thread2 : thread1);
                System.out.println(Thread.currentThread());
                LockSupport.park();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        lock.unlock();//不可达
    }


}
