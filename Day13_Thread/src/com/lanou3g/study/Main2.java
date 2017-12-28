package com.lanou3g.study;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(new HelloRunnable());
//
//        thread.start();


        for (int i = 0; i < 5; i++) {

            Thread.sleep(1000);

            System.out.print(".");
        }
    }

}
