package com.stackroute.domain;

public class Actor {

    private  String name;
    private  String gender;
    private  int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Actor name is "+name);
        System.out.println("Actor gender is "+gender);
        System.out.println("Actor age is "+age);

    }
}
