package c.c.k.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/**
 * Future
 */
public class Callable_3 {
    public static void main(String[] args) {
        Executors.newCachedThreadPool().submit(()->"");//Callable
        Executors.newCachedThreadPool().submit(()->{});//Runnable
    }
}
