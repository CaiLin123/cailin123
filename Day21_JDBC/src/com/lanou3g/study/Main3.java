package com.lanou3g.study;

import com.mysql.jdbc.Driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main3 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/work"+"?user=root&password=123";

        Properties info = new Properties();
        info.load(new FileReader("src/com/lanou3g/study/db.properties"));

        Connection con = DriverManager.getConnection(url, info);

        Statement state = con.createStatement();
        String update = "UPDATE hw_user" +" set uname='李二狗 '"+" where uname='张一山'";
        boolean execute = state.execute(update);

        state.close();
        con.close();


    }
}
