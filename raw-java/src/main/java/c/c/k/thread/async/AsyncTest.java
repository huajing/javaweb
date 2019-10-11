package c.c.k.thread.async;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * 提高接口的吞吐量，减少响应时间
 * @Title c.c.k.thread.async
 * @Copyright: Copyright 2019
 * @Description: java <br/>
 * @Created on 2019/10/10 chenck
 */
public class AsyncTest {
    private ExecutorService executorService = Executors.newFixedThreadPool(10);
    @Test
    public void testRunable2()  {
        try {
            long currentTimeMillis = System.currentTimeMillis();

//            Future future1 = executorService.submit(new MyRunnable(1000));
//            Future future2 = executorService.submit(new MyRunnable(2000));
//            Future future3 = executorService.submit(new MyRunnable(3000));

            Future<String> future1 = executorService.submit(new MyCallable(1000));
            Future<String> future2 = executorService.submit(new MyCallable(2000));
            Future<String> future3 = executorService.submit(new MyCallable(3000));

            String s1 = future1.get();
            String s2 = future2.get();
            String s3 = future3.get();

            System.out.println((System.currentTimeMillis() - currentTimeMillis));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRunable1()  {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Thread myThread1 = new Thread(new MyRunnable(1000));
            myThread1.start();
            myThread1.join();

            Thread myThread2 = new Thread(new MyRunnable(2000));
            myThread2.start();
            myThread2.join();


            Thread myThread3 = new Thread(new MyRunnable(3000));
            myThread3.start();
            myThread3.join();

            System.out.println((System.currentTimeMillis() - currentTimeMillis));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //无返回值
    public static class MyRunnable implements Runnable{
        private long sleep;
        public MyRunnable(int sleep){
            this.sleep = sleep;
        }
        @Override
        public void run() {
            try {
                //模拟业务执行时间
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

            }
        }
    }
    //有返回值
    public static class MyCallable implements Callable<String>{
        private long sleep;
        public MyCallable(long sleep){
            this.sleep = sleep;
        }
        @Override
        public String call() throws Exception {
            try {
                //模拟业务执行时间
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {

            }
            return "";
        }
    }


}
