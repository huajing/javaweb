package c.c.k.thread.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 2个线程交替打印
 */
public class PrintEachother_2 {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        new Thread(new MyRunnable(), "one-thread").start();
        new Thread(new MyRunnable(), "two-thread").start();
    }

    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            print();
        }
    }

    private static void print(){
        lock.lock();
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread());
                condition.signal();
                condition.await();//自己等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        lock.unlock();//不可达
    }


}
