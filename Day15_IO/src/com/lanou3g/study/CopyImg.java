package com.lanou3g.study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CopyImg {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/QQ图片20171208091909.jpg");

        byte[] buff = new byte[1024];
        int read = 0;
        FileOutputStream fos = new FileOutputStream("src/123.jpg");
        while ((read = fis.read(buff)) != -1){
            fos.write(buff,0,read);
        }
        fis.close();
        fos.close();


    }
}
