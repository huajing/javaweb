package c.c.k.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms100M
 * -Xmx100M
 * -Xss128k
 * -XX:MetaspaceSize=20m
 * -XX:MaxMetaspaceSize=20m
 * -XX:+PrintGCDetails
 * -XX:+PrintGCDateStamps
 * -XX:+PrintHeapAtGC
 * -Xloggc:./gclogs (日志的路径为当前项目的根路径)
 */
public class OOMTest {
    static List<Object> list = new ArrayList<>();
    public static void main(String[] args) {
        int idx = 0;
        while (true){
            idx++;
            long start = System.currentTimeMillis();
            list.add(new Object());
            long duration = System.currentTimeMillis() - start;
            if(duration>0)
                System.out.println("idx:"+idx+" duration:"+duration);
        }
    }
}
