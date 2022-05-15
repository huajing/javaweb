package c.c.k;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/15 9:18
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        List list = mock(List.class);
        when(list.get(0)).thenReturn(123);
        System.out.println(list.get(0));
    }
}
