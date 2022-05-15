package c.c.k.nio.blocking;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/17 14:50
 * @Version 1.0
 **/

public class NioServerBlockingTest {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.configureBlocking(false);
        serverChannel.bind(new InetSocketAddress(1234));

        Selector selector = Selector.open();
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true){
            SocketChannel accept = serverChannel.accept();
            System.out.println(accept.getRemoteAddress());
            /*Set<SelectionKey> selectionKeys = selector.selectedKeys();
            if(selectionKeys.size()>0){
                System.out.println("recevie data");
            }*/
        }
    }
}
