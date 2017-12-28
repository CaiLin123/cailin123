package com.lanou3g.study;

import com.lanou3g.study.util.Util;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays.*;
import java.util.List;
import java.util.Map;

public class WHQueryRunnerTest {

    /**
     * 根据需求结果的类型
     *      选择ResultSetHandler的实现类
     * 如果结果集为单行单列:ScalarHandler
     * 如果想要一个对象集合:MapHandler
     * 如果想要一个对象:BeanHandler
     * 如果想要一个Map:MapListHandler
     * 如果想要一个数组:ArrayHandler
     * 如果想要一个数组的集合:ArrayListHandler
     *
     */
    @Test
    public void queryByParams() throws SQLException {
        Long query = new WHQueryRunner().query
                (Util.getConnection(), "select count(*) from hw_user",
                        new ScalarHandler<Long>()
//                        , "李小龙"
                );

//        Number类
//        可以接收任何数值类型的值
//        Number类中有获取各种整形值的方法
        Number number = query;
//        获得int值
        int i = number.intValue();

        System.out.println(i);

//        for (Object[] objects:query) {
//            System.out.println(Arrays.toString(objects));
//
//        }

    }

    @Test
    public void queryBean() throws SQLException {
        List<User> query = new WHQueryRunner().query(
                Util.getConnection(),
                "select * from hw_user",
                new BeanListHandler<User>(User.class)
        );
        for (User user : query) {
            System.out.println(user.toString());
        }


        /*
        List<User> users = new WHQueryRunner().query(Util.getConnection(),
                                                "select * from hw_user",
                new BeanListHandler<User>(User.class));
        System.out.println(users);
    */}
    @Test
    public void queryMap() throws SQLException {
        Map<String, Object> objectMap = new WHQueryRunner().query(Util.getConnection(),
                "select * from hw_user", new MapHandler());
        System.out.println(objectMap.toString());
    }




}