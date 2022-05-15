package c.c.k;

import org.junit.Assert;

import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.*;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/15 9:18
 * @Version 1.0
 **/

public class Test {
    public static void main(String[] args) {
        List list = mock(List.class);
        //对应多次调用的返回
       /* when(list.get(0)).thenReturn(123, 234, 345);
        System.out.println(list.get(0));
        System.out.println(list.get(0));
        System.out.println(list.get(0));*/

        //Assert.assertEquals("123", 1,2);

        //doThrow(new RuntimeException()).when(list.size()).intValue();
        //when(list.get(anyInt())).thenThrow(new RuntimeException());

        //验证list的get(0)调用了2次，实际上是3次
        //verify(list, times(2)).get(0);
        //verify(list, timeout(1000)).get(1);
        //verify(list, never()).get(1);

        //System.out.println(list.size());

        when(list.get(anyInt())).thenReturn(anyInt());

        for (int i = 0; i < 100; i++) {
            System.out.println(list.get(0));
        }
    }
}
