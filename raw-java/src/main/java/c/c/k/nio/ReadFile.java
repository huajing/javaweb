package c.c.k.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

public class ReadFile {
    public static void main(String[] args) {
        try {
            RandomAccessFile r = new RandomAccessFile("", "");
            FileChannel channel = r.getChannel();
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            channel.read(allocate);

            SocketChannel open = SocketChannel.open();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
