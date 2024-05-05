package com.codingTest.OOPL.Day05.q3;

public class Date {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString(){
        String rslt = "";

        rslt += year + "년 ";
        rslt += month + "월 ";
        rslt += day + "일";

        return rslt;
    }

    public Date(){
        this.year = 1990;
        this.month = 1;
        this.day = 1;
    }
    public Date(int year){
        this.year = year;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year, int month){
        this.year = year;
        this.month = month;
        this.day = 1;
    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
