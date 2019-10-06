package c.c.k.thread.pool;

import java.util.concurrent.*;

/**
 * Executors 为 ThreadPoolExecutor 的工厂方法
 *                               int corePoolSize,
 *                               int maximumPoolSize,
 *                               long keepAliveTime,
 *                               TimeUnit unit,
 *                               BlockingQueue<Runnable> workQueue,
 *                               ThreadFactory threadFactory,
 *                               RejectedExecutionHandler handler
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,
                0, TimeUnit.DAYS, new LinkedBlockingDeque(10));
        Future<Integer> future1 = threadPoolExecutor.submit(() -> 1);
        Future<Integer> future2 = threadPoolExecutor.submit(() -> 1);
        Future<Integer> future3 = threadPoolExecutor.submit(() -> 1);


    }
}
