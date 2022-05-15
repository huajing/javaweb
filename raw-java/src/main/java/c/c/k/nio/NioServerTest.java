package c.c.k.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/4/17 14:50
 * @Version 1.0
 **/

public class NioServerTest {
    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();

        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.configureBlocking(false);
        serverChannel.bind(new InetSocketAddress(1234));
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("server started...");
        final ByteBuffer byteBuffer = ByteBuffer.wrap("hi client".getBytes());
        while (true){
            selector.select();

            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()){
                SelectionKey selectionKey = iterator.next();
                iterator.remove();//非常重要的操作，否则下次还能获取到，导致报错
                try {
                    if(selectionKey.isAcceptable()){
                        ServerSocketChannel  channel = (ServerSocketChannel )selectionKey.channel();
                        SocketChannel accept = channel.accept();
                        accept.socket().setKeepAlive(true);
                        accept.socket().setTcpNoDelay(true);
                        accept.configureBlocking(false);
                        accept.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
                        System.out.println("Accepted connection from " + accept);
                    } else if(selectionKey.isReadable()){
                        SocketChannel channel = (SocketChannel)selectionKey.channel();

                        ByteBuffer allocate = ByteBuffer.allocate(1024);
                        channel.read(allocate);//channel可读
                        String s = new String(allocate.array());
                        System.out.println(s);
                        channel.write(ByteBuffer.wrap(("received " + s).getBytes()));//channel可写
                        //channel.close();
                    } else if(selectionKey.isWritable()){
                        SocketChannel channel = (SocketChannel)selectionKey.channel();
                        channel.write(byteBuffer);
                        //channel.close();
                    }
                }catch (Exception ex){
                    ex.printStackTrace();
                    selectionKey.cancel();
                }finally {
                    //selectionKey.cancel();
                }
            }
        }
    }
}
