package c.c.k.thread.concurrent;

/**
 * 2个线程交替打印
 */
public class PrintEachother_1 {
    private static Object lock = new Object();

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
        synchronized (lock) {//持有锁
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread());
                    lock.notify();//
                    lock.wait();//自己等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
