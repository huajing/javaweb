package c.c.k.thread.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest implements Runnable{
    Semaphore semaphore = new Semaphore(5);

    @Override
    public void run(){
        try {
            semaphore.acquire();
            Thread.sleep(5000);
            System.out.println(Thread.currentThread());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SemaphoreTest test = new SemaphoreTest();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            executorService.execute(test);
        }

        try {
            Thread.sleep(2000);
            System.out.println("timeout");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 20; i++) {
            executorService.execute(test);
        }

        executorService.shutdown();
    }
}
