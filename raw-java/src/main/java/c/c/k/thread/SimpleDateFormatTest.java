package c.c.k.thread;

import org.assertj.core.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDateFormatTest extends Thread{
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(Thread.currentThread() + simpleDateFormat.format(new Date()));
        }
    }

    public static void main(String[] args) {
//        new SimpleDateFormatTest().start();
//        new SimpleDateFormatTest().start();
//        new SimpleDateFormatTest().start();
//        new SimpleDateFormatTest().start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            executorService.execute(()->{
                DateUtil.parse("2019-01-01 12:00:00");
            });
        }
        executorService.shutdown();
    }
}
