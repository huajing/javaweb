package c.c.k.thread.pool;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    @Test
    public void test1() {
        CompletableFuture.allOf(
                CompletableFuture.supplyAsync(()->1),
                CompletableFuture.supplyAsync(()->1)).thenCombine(CompletableFuture.completedFuture("ss"), (a,b)->1);

        CompletableFuture.supplyAsync(()->"hello")
                .thenApply(s->s+" word")
                .thenApply(String::toUpperCase)
                .thenCombine(CompletableFuture.completedFuture(" java"),(s1, s2)->1)
                .thenAccept(System.out::println);
    }

    /**
     *
     */
    @Test
    public void test2(){
        try {
            CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println("supplyAsync exec");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "";
            });
            Thread.sleep(1000);
            System.out.println("main exec");
            supplyAsync.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception ee){

        }
    }
}
