package com.lanou3g.study;

import java.sql.*;

public class Main5 {
    public static void main(String[] args) {
        /**
         * 1,PerpareStatement可以使用动态参数
         *      Statement只能使用静态
         *
         * 2,可以防止sql注入
         *      什么是sql注入?
         *
         */

        JdbcUtil.execute(conn -> {
            try {
                PreparedStatement pstate = conn.prepareStatement
                        ("SELECT * from hw_user WHERE  loc=? AND age>?");
                pstate.setString(1,"北京");
                pstate.setInt(2,20);
                ResultSet rs = pstate.executeQuery();
                JdbcUtil.showRS(rs);
                return pstate;
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return null;
        });
    }
}
