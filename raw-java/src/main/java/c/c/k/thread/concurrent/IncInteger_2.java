package c.c.k.thread.concurrent;
/**
 * 2个线程各执行10000次++，理想结果为20000，而实际情况为并发执行，导致2个线程不安全
 * 用synchronized 给idx++包起来
 */
public class IncInteger_2 {
    public static void main(String[] args) throws Exception {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();myThread2.start();
        myThread1.join();myThread2.join();

        System.out.println(MyThread.idx);
    }

    public static class MyThread extends Thread{
        public static Object object = new Object();
        public static int idx;
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                synchronized (object) {//object要让多个线程都认为是同一个对象
                    idx++;
                }
            }
        }
    }
}
