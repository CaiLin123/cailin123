package com.lanou3g.study;

import com.lanou3g.study.syn.TicketDemo;

public class Main4 {
    public static void main(String[] args) {

        /*
        synchronized
        同步:如果你先开始了,那等你干完了我在开始
        异步:你干你的,我干我的
     */

        TicketDemo td = new TicketDemo();

        startSell(td);
        startSell(td);
        startSell(td);
        startSell(td);

    }

    private static void startSell(TicketDemo td) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //在这个线程中,调用td方法时
                //我们说这个现象为:
                //线程进入了这个sellTicket方法
                td.sellTicket();
            }
        }).start();
    }
}
