package com.lanou3g.study;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZuoYe {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("请选择选项:1.注册  2.登录");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a){
            case 1:
                for(int b = 0; b < list.size()+1;b++) {
                    System.out.println("注册");
                    System.out.println("请输入用户名");
                    Scanner Sc = new Scanner(System.in);
                    String id = Sc.nextLine();
                    list.add(id);
                    System.out.println("请输入密码");
                    Scanner Scn = new Scanner(System.in);
                    String password = Scn.nextLine();
                    list.add(password);
                    System.out.println("请输入姓名");
                    Scanner Sca = new Scanner(System.in);
                    String name = Sca.nextLine();
                    list.add(name);
                    System.out.println("请输入职业");
                    Scanner in = new Scanner(System.in);
                    String work = in.nextLine();
                    list.add(work);
                    break;
                }

                case 2:
                    System.out.println("登录");
                    System.out.println("请输入用户名");
                    Scanner inp =new Scanner(System.in);
                    String id1 = inp.nextLine();
                    for (int b = 0;b < list.size();b++){
                        if (id1 == list.get(b)){
                            System.out.println("请输入密码");
                            Scanner Scan = new Scanner(System.in);
                            String password1 = Scan.nextLine();

                        }






                }
        }


    }


}
