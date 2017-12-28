package com.lanou3g.study;

import java.sql.SQLException;
import java.util.Scanner;

public class operate {
//    private static void operate(){
public static void main(String[] args) throws SQLException {
    while (true) {
        System.out.println("1.查看所有用户\t2.增添用户\t3.删除用户\t4.修改用户");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        input.nextLine();
        switch (i) {
            case 1:
                com.lanou3g.study.toos.Tool.query();
                break;
            case 2:
                System.out.println("请输入用户名");
                String uname = input.nextLine();
                System.out.println("请输入居住地址");
                String loc = input.nextLine();
                System.out.println("请输入年龄");
                String age = input.nextLine();
                com.lanou3g.study.toos.Tool.Insert(uname, loc, age);
                break;
            case 3:
                System.out.println("请输入你要删除的用户名");
                String uname1 = input.nextLine();
                com.lanou3g.study.toos.Tool.delete(uname1);
                break;
            case 4:
                System.out.println("请输入你要修改的用户名");
                String uname2 = input.nextLine();
                System.out.println("请输入你要修改的居住地址");
                String loc1 = input.nextLine();
                System.out.println("请输入你要修改的年龄");
                String age1 = input.nextLine();
                com.lanou3g.study.toos.Tool.update(uname2, loc1, age1);

        }
    }
}

//    }

}
