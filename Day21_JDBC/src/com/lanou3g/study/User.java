package com.lanou3g.study;

public class User {
    private String uname;
    private int id;
    private int age;
    private String loc;

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", loc='" + loc + '\'' +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public User() {

        this.uname = uname;
        this.id = id;
        this.age = age;
        this.loc = loc;
    }
}
