package c.c.k.net;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.util.Random;

/**
 * @Description TODO
 * @Author chenck
 * @Date 2022/5/15 15:34
 * @Version 1.0
 **/

public class UdpClientTest {
    public static void main(String[] args) {
        try {
            InetSocketAddress serverAddr = new InetSocketAddress("localhost", 1234);
            DatagramSocket socket = new DatagramSocket();
            int idx = 0;
            while (true) {
                byte[] bytes = ("data:" + idx++).getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, serverAddr);
                //目的地数据包在DatagramPacket中
                socket.send(datagramPacket);
                Thread.sleep(1000);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
