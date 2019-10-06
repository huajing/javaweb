package c.c.k.thread;

import java.util.concurrent.locks.LockSupport;

/**
 *  测试创建线程所需要的时间
 *
 */
public class CreateThreadTimeTest {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            long currentTimeMillis = System.currentTimeMillis();
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread() + " " + (System.currentTimeMillis() - currentTimeMillis));
                LockSupport.park();//LockSupport.unpark(thread);
            });
            thread.start();
        }
    }
}
