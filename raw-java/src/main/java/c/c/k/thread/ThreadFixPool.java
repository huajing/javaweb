package c.c.k.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadFixPool {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            executorService.execute(()->{
                try {
                    Thread.sleep(1000);
                    System.out.println("over" + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        System.out.println("start thread end..");
        executorService.shutdown();
    }
}
