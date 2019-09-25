package c.c.k;

import org.junit.Test;

import java.util.concurrent.Executors;



public class Exc {
    @Test
    public void test01() throws Exception{
        Thread thread1 = new Thread(new TheadA(1));
        Thread thread2 = new Thread(new TheadA(0));
        thread1.join();
        thread2.join();

        System.out.println();
//        Executors.newCachedThreadPool().execute(()-> System.out.println("ss"));
    }
}


class TheadA implements Runnable{
    private int start;
    public TheadA(int start){
        this.start = start;
    }
    static int anInt = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10000; i+=2) {
            anInt++;
        }
    }

    public static int getAnInt() {
        return anInt;
    }
}
