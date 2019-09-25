package c.c.k;

import org.junit.Test;

import java.util.concurrent.Executors;

public class TestThread {
    static int idx=0;
    @Test
    public void test() {

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println("haha:" + idx++);
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(idx);

    }
}
