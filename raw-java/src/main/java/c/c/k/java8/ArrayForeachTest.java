package c.c.k.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Predicate.*;
import java.util.stream.IntStream;

public class ArrayForeachTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        System.out.println(integers);
//        integers.removeIf(t->t.intValue()>1);
//        integers.forEach(System.out::println);
//        integers.forEach(n-> System.out.println(n));

    }
}
