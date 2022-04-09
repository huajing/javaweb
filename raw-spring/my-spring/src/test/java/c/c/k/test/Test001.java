package c.c.k.test;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class Test001 {
    public static void main(String[] args) throws IOException {
        Enumeration<URL> c = Test001.class.getClassLoader().getResources("c/c/k/test/");
        while (c.hasMoreElements()){
            URL url = c.nextElement();
            System.out.println(url);
        }
    }
}
