package c.c.k.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class MyAqs extends AbstractQueuedSynchronizer {
    public MyAqs(){
        this.setState(0);
    }
    public void inc(){
        boolean b = false;
        do {
            int state = this.getState();
            b = this.compareAndSetState(state, 1 + state);
            if(!b){
                System.out.println("compareAndSetState is false");
            }
        }while (!b);
    }
    public static void main(String[] args) {
        final MyAqs myAqs = new MyAqs();
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        for (int i = 0; i < 1000; i++) {
            executorService.execute(()->{
                myAqs.inc();
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
            executorService.shutdown();
            System.out.println(myAqs.getState());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
