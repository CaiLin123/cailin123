package com.lanou3g.tcp.study;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendMain {
    public static void main(String[] args) throws IOException {
        //创建一个socket对象
        //至此那个目标的ip地址和端口号
        Socket socket = new Socket("192.168.11.128",9999);


        //获得socket对象的输出工具
        //这个东西我们叫做流
        OutputStream os = socket.getOutputStream();

        //调用这个工具的写方法
        //把要传输的内容作为参数传进去
        //参数是一个字节数组
        os.write("一尺深红胜曲尘,天生旧物不如新.合欢桃核终堪恨,里许元来别有人.井底点灯深烛伊,共郎长行莫围棋.玲珑骨子安红豆,入骨相思知不知.".getBytes());

        //关闭socket
        socket.close();
    }
}
