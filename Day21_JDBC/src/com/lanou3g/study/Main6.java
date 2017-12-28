package com.lanou3g.study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main6 {
    public static void main(String[] args) {

        //{}就是匿名内部类实现类ExecuteInter接口时
        //复写的那个方法execute的方法体
        //conn就是execute方法的参数
        JdbcUtil.execute(conn -> {
            try {
                PreparedStatement pstate = conn.prepareStatement
                        ("INSERT INTO  hw_user " + " VALUES (NULL ,'zhangsan',30,'上海')");
                //将30岁的张三插入到批处理中
                pstate.addBatch();
                //添加批处理
                pstate.addBatch
                        ("INSERT INTO  hw_user " + " VALUES (NULL ,'lisi',10,'武汉')");
                pstate.addBatch
                        ("INSERT INTO  hw_user " + " VALUES (NULL ,'张三',11,'上海')");
                //开始执行批处理任务
                pstate.executeBatch();
                return pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
