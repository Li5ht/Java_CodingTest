package com.codingTest.OOPL.Day06.q2;

public class Person {
    private String name, address;
    private int age;

    public String getAddress() {return address;}
    public void setAddress(String address) { this.address = address;}
    public void setName(String name) { this.name = name;}
    public String getName() { return name;}
    public int getAge() { return age;}
    public void setAge(int age) { this.age = age;}

    public String toStoring(){
        return "이름: "+name+", 나이: "+age+", 주소: "+address+"\n";
    }

    public Person(){
        this.name = "모름";
        this.address = "모름";
        this.age = -1;
    }

    public Person(String name){
        this.name = name;
        this.address = "모름";
        this.age = -1;
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
        this.age = -1;
    }

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

}
