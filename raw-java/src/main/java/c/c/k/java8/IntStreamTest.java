package c.c.k.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamTest {
    int max = 1<<30;
    @Test
    public void test01(){
        long currentTimeMillis = System.currentTimeMillis();
        IntStream.range(1, max).parallel().sum();
        System.out.println("parallel "+(System.currentTimeMillis()-currentTimeMillis));
    }

    @Test
    public void test02(){
        long currentTimeMillis = System.currentTimeMillis();
        IntStream.range(1, max).sum();
        System.out.println("not parallel " + (System.currentTimeMillis()-currentTimeMillis));

        Arrays.asList(1,2,3).stream();
    }
}
