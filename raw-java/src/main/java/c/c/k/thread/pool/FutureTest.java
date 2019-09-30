package c.c.k.thread.pool;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    /**
     * test Future Runnable
     */
    @Test
    public void test01() {
        Future<Integer> submit = Executors.newCachedThreadPool().submit(() -> {
            System.out.println("start sleep");
            Thread.sleep(2000);
            System.out.println("end sleep");
            return 1;
        });

        try {
            System.out.println("before");
            submit.get();
            System.out.println("after");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02(){
        Callable<Integer> callable = () -> 132;
        Executors.newCachedThreadPool().submit(callable);
        Executors.newCachedThreadPool().submit(() -> 132);
        Executors.newCachedThreadPool().submit(()->{return 123;});
        Future<Integer> submit = Executors.newCachedThreadPool().submit(new MyCallable(123));

    }

    public static class MyCallable implements Callable<Integer> {
        private int abc;
        public MyCallable(int abc){
            this.abc = abc;
        }
        @Override
        public Integer call() throws Exception {
            System.out.println(abc);
            return 1;
        }
    }
}
