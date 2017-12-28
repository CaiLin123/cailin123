package com.lanou3g.study;

/**
 * 一是某个类只能有一个实例
 * 二是它必须自行创建这个实例
 * 三是它必须自行向整个系统
 */
public class Test {
    private Test(){

    }
    static Test test = new Test();

    public static Test getTest() {
        return test;
    }
}
