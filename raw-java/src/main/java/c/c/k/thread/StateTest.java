package c.c.k.thread;


import java.util.Scanner;

public class StateTest {
    public static Object object = new Object();

    public static void main(String[] args) throws Exception{
        MyThread1 thread1 = new MyThread1("my-sb-thread1");
        thread1.start();

        MyThread2 thread2 = new MyThread2("my-sb-thread2");
        thread2.start();
    }

    public static class MyThread1 extends Thread{
        public MyThread1(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (object) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class MyThread2 extends Thread{
        public MyThread2(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (object) {
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                object.notify();
            }
        }
    }
}
