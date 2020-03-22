package com.ex.spring.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int uid;
    private String uname;
    private String gender;
    private List<Company> companys;
    private List<Child> children;

    public User() {
    }

    public User(int uid, String uname, String gender) {
        this.uid = uid;
        this.uname = uname;
        this.gender = gender;
    }


    public User(int uid, String uname, String gender, List<Child> children) {
        this.uid = uid;
        this.uname = uname;
        this.gender = gender;
        this.children = children;
    }

    public User(int uid, String uname, String gender, List<Company> companys, List<Child> children) {
        this.uid = uid;
        this.uname = uname;
        this.gender = gender;
        this.companys = companys;
        this.children = children;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getCompanys() {
        List<String> str=new ArrayList<>();
        for (Company val:companys) {
            str.add(val.getCompanyName());
        }
        return str;
    }

    public void setCompanys(List<Company> companys) {
        this.companys = companys;
    }

    public List<String> getChildren() {
        List<String> str=new ArrayList<>();
        for (Child val:children) {
            str.add(val.getChildName());
        }
        return str;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", gender='" + gender + '\'' +
                ", companys=" + getCompanys() +
                ", children=" + getChildren() +
                '}';
    }
}
