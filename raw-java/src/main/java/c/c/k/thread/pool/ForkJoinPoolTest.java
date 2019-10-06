package c.c.k.thread.pool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ForkJoinPoolTest {
    public static void main(String[] args) {
        try {
            ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
            Integer integer = forkJoinPool.submit(new MyRecursiveTask(0, 100000000)).get();
            System.out.println(integer);
            forkJoinPool.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //System.out.println(IntStream.range(0, 20).parallel().sum()); //190
    }

    /**
     * RecursiveAction 无返回值
     * RecursiveTask 有返回值
     */
    static class MyRecursiveTask extends RecursiveTask<Integer>{
        private int start;
        private int end;
        MyRecursiveTask(int start, int end){
            this.start = start;
            this.end = end;
        }
        @Override
        protected Integer compute() {
            final int maxSize = 10;
            int sum = 0;
            if((end - start)<=maxSize){
                for (int i = start; i < end; i++) {
                    sum += i;
                }
            }else {
                List<ForkJoinTask<Integer>> list = new ArrayList();
                int tempStart = start;
                int tempEnd = 0;
                while (true){
                    tempEnd = tempStart + maxSize;
                    if(tempEnd < end){
                        list.add(new MyRecursiveTask(tempStart, tempEnd).fork());
                    }else {
                        list.add(new MyRecursiveTask(tempStart, end).fork());
                        break;
                    }
                    tempStart = tempEnd;
                }
                System.out.println(list.size());
                for (ForkJoinTask<Integer> task : list) {
                    sum += task.join();
                }
            }
            return sum;
        }
    }

    static class MyRecursiveAction extends RecursiveAction{
        @Override
        protected void compute() {

        }
    }
}
