package com.lanou3g.study.toos;

import com.lanou3g.study.User;
import com.lanou3g.study.WHQueryRunner;
import com.lanou3g.study.util.Util;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Tool {
    //增
    public static void Insert(String uname,String loc,String age){
        Util.execute(conn -> {
            PreparedStatement pps = conn.prepareStatement
                                ("INSERT INTO hw_user VALUES (?,?,?)");
            pps.setString(1,uname );
            pps.setString(2,loc );
            pps.setString(3,age );
            return pps;

        });
    }
    //删
    public static void delete(String uname){
        Util.execute(conn -> {
            PreparedStatement pps = conn.prepareStatement("DELETE FROM hw_user WHERE uname= '" + uname+ "'");
            return pps;
        });
    }
    //改
    public static void update(String uname,String loc,String age){
        Util.execute(conn -> {
            PreparedStatement pps = conn.prepareStatement("UPDATE hw_user SET uname='" + uname + "',loc='" + loc + "',age='" + age + "'");
            return pps;
        });
    }
    //查
    @Test

    public static void query() throws SQLException {
        List<User> query = new WHQueryRunner().query(
                Util.getConnection(),
                "select * from hw_user",
                new BeanListHandler<User>(User.class)
        );
        for (User user : query) {
            System.out.println(user.toString());
        }
    }


}
