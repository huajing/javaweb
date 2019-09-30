package c.c.k.thread.pool;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTest {
    public volatile int anInt;

    public void add(){
        anInt=anInt+1;
    }
    @Test
    public  void test01() throws Exception{
        CountDownLatchTest test = new CountDownLatchTest();
        int count = 100;
        final int max=10;
        final CountDownLatch latch = new CountDownLatch(count);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < count; i++) {
           executorService.execute(()->{
               for (int j = 0; j < max; j++) {
                   test.add();
               }
               latch.countDown();
           });
        }
        latch.await();
        executorService.shutdown();
        System.out.println(test.anInt);
    }
}
