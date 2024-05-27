package com.codingTest.OOPL.Day06.q3;

public class Student extends Person {
    private String major;
    private long sId;

    public String getMajor() { return major;}
    public void setMajor(String major) { this.major = major;}
    public long getsId() { return sId;}
    public void setsId(long sId) { this.sId = sId;}

    public String printSafely(){
        return toString()+ ", 학번: "+sId+", 전공: "+ major+"\n";
    }

    public Student(){
        super();
        this.sId = -1;
        this.major = "모름";
    }

    public Student(String name){
        super(name);
        this.sId = -1;
        this.major = "모름";
    }

    public Student(String name, int age, long sId){
        super(name, age);
        this.sId = sId;
        this.major = "모름";
    }

    public Student(String name, int age, String address, long sId, String major){
        super(name, age, address);
        this.sId = sId;
        this.major = "모름";
    }
}
