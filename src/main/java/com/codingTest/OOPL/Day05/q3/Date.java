package com.codingTest.OOPL.Day05.q3;

public class Date {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(){
        year = 1;
    }

    public Date(int y){
        year = y;
    }

    public boolean isReap(){
        if (((year % 4 == 0) & (year%100 != 0)) | (year % 400 == 0))
            return true;
        else
            return false;
    }

    public String testReapYears() {
        if (isReap() == true)
            return year + "년은 윤년입니다.";
        return year + "년은 윤년이 아닙니다.";
    }

}
