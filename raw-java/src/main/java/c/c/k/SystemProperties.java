package c.c.k;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/2 23:41
 * @Version 1.0
 **/

public class SystemProperties {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println(System.getProperty("test.p"));
        System.out.println(System.getenv("ab"));
    }
}
