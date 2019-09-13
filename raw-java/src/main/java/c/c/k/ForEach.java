package c.c.k;

import java.util.HashMap;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.forEach((k,v)->{
            System.out.println( k + " " + v);
        });
    }
}
