package c.c.k.java8;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ForEach {

    @Test
    public void printMap() {
        Map map = new HashMap();
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, "value:" + i);
        }

        map.forEach((k,v)->{
            System.out.println( k + " " + v);
        });
    }
}
