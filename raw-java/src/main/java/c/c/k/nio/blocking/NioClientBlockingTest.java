package c.c.k.nio.blocking;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/17 14:50
 * @Version 1.0
 **/

public class NioClientBlockingTest {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress(1234));
        socketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true){
            int select = selector.selectNow();
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()){
                SelectionKey next = iterator.next();
                if(next.isAcceptable()){

                }
            }
        }
    }
}
