package c.c.k.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/17 14:50
 * @Version 1.0
 **/

public class NioClientTest {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        SocketChannel socketChannel = SocketChannel.open();
//        socketChannel.configureBlocking(false);
        socketChannel.connect(new InetSocketAddress(1234));
        socketChannel.register(selector, SelectionKey.OP_READ);
        ExecutorService executorService = Executors.newFixedThreadPool(1, (r -> {
            Thread thread = new Thread(r,"cck-channel");
            thread.setDaemon(true);
            return thread;
        }));
        executorService.execute(new MyChannel(selector));

        if(socketChannel.finishConnect()){
            while (true) {
                ByteBuffer wrap = ByteBuffer.wrap((new Random().nextLong() + "hi server").getBytes());
                try {
                    while (wrap.hasRemaining()) {
                        socketChannel.write(wrap);
                    }
                    Thread.sleep(1000);
                }catch (Exception ex){
                    ex.printStackTrace();
                    socketChannel.close();
                }finally {
                }

            }
            //socketChannel.close();
        }
    }

    static class MyChannel implements Runnable{
        private Selector selector;
        private MyChannel(Selector selector){
            this.selector = selector;
        }
        @Override
        public void run() {
            while (true) {
                try {
                    ByteBuffer allocate = ByteBuffer.allocate(1024);
                    selector.selectNow();
                    System.out.println("select");
                    Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                    while (iterator.hasNext()) {
                        SelectionKey next = iterator.next();
                        iterator.remove();
                        if (next.isReadable()) {
                            SocketChannel channel = (SocketChannel) next.channel();
                            allocate.clear();
                            channel.read(allocate);
                            System.out.println(new String(allocate.array()));
                        }
                    }
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
