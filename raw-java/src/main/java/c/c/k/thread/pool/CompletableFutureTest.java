package c.c.k.thread.pool;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->"hello")
                .thenApply(s->s+" word")
                .thenApply(String::toUpperCase)
                .thenCombine(CompletableFuture.completedFuture(" java"),(s1, s2)->s1+s2)
                .thenAccept(System.out::println);
    }
}
