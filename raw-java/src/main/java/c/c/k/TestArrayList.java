package c.c.k;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TestArrayList {

    /**
     * 指定initialCapacity
     * 执行时间比不指定快3倍
     */
    @Test
    public void setCapacity() {
        for (int j = 0; j < 10; j++) {
            List<Integer> list = new ArrayList<>(100000000);
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000000; i++) {
                list.add(1);
            }
            System.out.println("set initialCapacity time:" + (System.currentTimeMillis()-start));
        }
    }

    /**
     * 不指定initialCapacity
     * 效率很低
     */
    @Test
    public void notSetCapacity() {
        for (int j = 0; j < 10; j++) {
            List<Integer> list = new ArrayList<>();
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000000; i++) {
                list.add(1);
            }
            System.out.println("not set initialCapacity time:" + (System.currentTimeMillis()-start));
        }
    }
}
