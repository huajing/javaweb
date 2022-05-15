package c.c.k.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/15 15:34
 * @Version 1.0
 **/

public class UdpServerTest {
    public static void main(String[] args) {
        final int length = 1024;
        try {

            DatagramSocket socket = new DatagramSocket(1234);
            ByteBuffer allocate = ByteBuffer.allocate(length);
            DatagramPacket datagramPacket = new DatagramPacket(allocate.array(), length);

            while (true) {
                socket.receive(datagramPacket);

                System.out.println(new String(datagramPacket.getData()));
                System.out.println(datagramPacket.getSocketAddress());
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
