package c.c.k.thread.concurrent;

/**
 * 2个线程交替打印
 */
public class PrintThree_1 {
    private static Object lock = new Object();
    private static volatile int idx = 0;

    public static void main(String[] args) {
        new Thread(new MyRunnable(0), "one-thread").start();
        new Thread(new MyRunnable(1), "two-thread").start();
        new Thread(new MyRunnable(2), "three-thread").start();
    }

    public static class MyRunnable implements Runnable{
        private int myIdx;

        MyRunnable(int myIdx){
            this.myIdx = myIdx;
        }
        @Override
        public void run() {
            print(myIdx);
        }
    }

    private static void print(int myIdx){
        while (true){
            try {
                Thread.sleep(1000);
                if(idx % 3 == myIdx) {
                    System.out.println(Thread.currentThread());
                    synchronized (lock) {
                        idx++;
//                        if(idx>Integer.MAX_VALUE-1)
//                            idx = 0;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
