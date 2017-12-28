package com.lanou3g.study.decorator;

import com.lanou3g.study.componet.饮品;

public class 加醋Decorator extends Decorator{

    public 加醋Decorator(饮品 yp){
        super(yp);
    }



    @Override
    public int price() {
        return yp.price()+2;
    }
    @Override
    public String getName(){
        return "加醋的"+yp.getName();
    }
}
