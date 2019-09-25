package c.c.k.thread.pool;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class ExecutorsTest {
    public static int anInt;

    private AtomicLong atomicLong = new AtomicLong();

    public void add(){
        long incrementAndGet = atomicLong.incrementAndGet();
        if(incrementAndGet<10) {
            anInt = anInt + 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("add 1=============" +incrementAndGet);

        }else {
            System.out.println("not add 1..." + incrementAndGet);
        }

        atomicLong.decrementAndGet();
    }
    @Test
    public void test01() throws Exception{
        ExecutorsTest test = new ExecutorsTest();
        int count = 10;
        final CountDownLatch latch = new CountDownLatch(count);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < count; i++) {
           executorService.submit(()->{
//               System.out.println(Thread.currentThread());
               IntStream.range(1, 1000).forEach((ii)-> {
                   test.add();
//                   try {
//                       Thread.sleep(1);
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
               });
               System.out.println(Thread.currentThread() + " exec over");
               latch.countDown();
           });
        }
        latch.await();
        executorService.shutdown();
        System.out.println(ExecutorsTest.anInt);

        System.out.println(IntStream.range(1, 1000).parallel().sum());
    }
}
