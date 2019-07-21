package c.c.k;

public class TestThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println("haha");
            }).start();
        }
    }
}
