package c.c.k.thread;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeTest {
    private static Unsafe unsafe;
    private static long valueOffset;
    static {
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe"); // Internal reference
            f.setAccessible(true);
            unsafe = (Unsafe) f.get(null);
            valueOffset = unsafe.objectFieldOffset(UnsafeTest.class.getDeclaredField("value"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    private volatile int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        UnsafeTest unsafeTest = new UnsafeTest();
        unsafe.getAndSetInt(unsafeTest, valueOffset, 11111);//原子操作
        System.out.println(unsafeTest.getValue());
    }
}
