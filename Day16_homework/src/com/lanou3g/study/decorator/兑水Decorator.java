package com.lanou3g.study.decorator;

import com.lanou3g.study.componet.饮品;

public class 兑水Decorator extends Decorator{
    public 兑水Decorator(饮品 yp) {
        super(yp);
    }

    @Override
    public int price() {
        return yp.price()-5;
    }
    @Override
    public String getName(){
        return "兑水的"+yp.getName();
    }
}
