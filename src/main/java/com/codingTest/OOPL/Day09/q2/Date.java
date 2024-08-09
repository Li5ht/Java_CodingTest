package com.codingTest.OOPL.Day09.q2;

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


    public String westerMonth(){
        String mth = "";
        switch(month){
            case 1 : mth = "Jan"; break;
            case 2 : mth = "Feb"; break;
            case 3 : mth = "Mar"; break;
            case 4 : mth = "Apr"; break;
            case 5 : mth = "May"; break;
            case 6 : mth = "Jun"; break;
            case 7 : mth = "Jul"; break;
            case 8 : mth = "Aug"; break;
            case 9 : mth = "Sep"; break;
            case 10 : mth = "Oct"; break;
            case 11 : mth = "Nov"; break;
            case 12 : mth = "Dec"; break;
            default : mth = "Invalid month"; break;

        }
        return mth;
    }

    public String printWestern(){
        return westerMonth() +" "+day+", "+year;
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

   /* public int isReap(){
        return 0;
    }

    public int testReapYears(){
        return 0;
    }*/

  /*  public static int compareDate(Date x, Date y){
        *//*if (x.year == y.year)
            if (x.month == y.month){
                if (x.day > y.day)
                    return -1;
                else
                    return 1;
            }
        else
            return 0;

        else if ()*//*
    }
*/

}