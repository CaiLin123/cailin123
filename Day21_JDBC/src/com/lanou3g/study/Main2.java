package com.lanou3g.study;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //将Driver类加载进内存
        //也就会执行该类的静态代码块
        //也就实现了注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/work" + "?user=root&password=123");

        Statement statement = con.createStatement();

        int i= statement.executeUpdate("INSERT INTO hw_user VALUE (NULL ,'张一山',40,'北京')");
        //受影响的行数
        System.out.println(i);
        statement.close();
        con.close();

    }
}
