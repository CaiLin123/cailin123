package com.lanou3g.study;

public class Test1 {


    private Test1() {
    }
    static Test1 test1 = null;

    public static Test1 getTest1() {
        if (test1 == null){
            synchronized (Test1.class) {
                if (test1 == null) {
                    test1 = new Test1();
                }
            }
        }
        return test1;
    }

}
