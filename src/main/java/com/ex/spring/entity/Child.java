package com.ex.spring.entity;

public class Child {
    private String childName;

    public Child() {
    }

    public Child(String childName) {
        this.childName = childName;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    @Override
    public String toString() {
        return "Child{" +
                "childName='" + childName + '\'' +
                '}';
    }
}
