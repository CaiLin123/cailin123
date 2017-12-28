package com.lanou3g.study;

public class User {
    private String uname;
    private int uid;
    private String loc;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", id=" + uid +
                ", loc='" + loc + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getId() {
        return uid;
    }

    public void setId(int id) {
        this.uid = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String uname, int id, String loc, int age) {

        this.uname = uname;
        this.uid = id;
        this.loc = loc;
        this.age = age;
    }
}
