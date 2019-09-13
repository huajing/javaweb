package c.c.k;

import org.junit.Test;

public class TestThread {
    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            final int idx = i;
            new Thread(()->{
                System.out.println("haha:" + idx);
            }).start();
        }
    }
}
