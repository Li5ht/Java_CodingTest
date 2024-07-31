package com.codingTest.OOPL.Day08.q1;

public class Student {
    private String name, major;
    private long sId;

    public String getMajor() { return major;}
    public void setMajor(String major) { this.major = major;}
    public long getsId() { return sId;}
    public void setsId(long sId) { this.sId = sId;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String printSafely(){
        return toString()+ ", 학번: "+sId+", 전공: "+ major+"\n";
    }

    public boolean isTheSame(Student s){
        if (sId==s.sId)
            return true;
        return false;
    }

    public Student(){
        this.name = "모름";
        this.sId = -1;
        this.major = "모름";
    }

    public Student(String name){
        this.name = name;
        this.sId = -1;
        this.major = "모름";
    }
    public Student(String name, long sId){
        this.name = name;
        this.sId = sId;
        this.major = "모름";
    }

    public Student(String name, long sId, String major){
        this.name = name;
        this.sId = sId;
        this.major = major;
    }

}
