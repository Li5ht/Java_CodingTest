package com.codingTest.OOPL.Day08.q2;

public class Date {
    private Integer year;
    private Integer month;
    private Integer date;

    public Integer getYear() {return year;}
    public void setYear(Integer year) {this.year = year;}
    public Integer getDate() { return date;}
    public void setDate(Integer date) {this.date = date;}
    public Integer getMonth() {return month;}
    public void setMonth(Integer month) {this.month = month;}

    public String toStirng(){
        return year + "년"  + month + "월" + date + "일";
    }

    public Date(){
            this.year = 1900;
            this.month = 1;
            this.date = 1;
    }
    public Date(Integer year){
            this.year = year;
            this.month = 1;
            this.date = 1;
    }

    public Date(Integer year, Integer month){
            this.year = year;
            this.month = month;
            this.date = 1;
    }

    public Date(Integer year, Integer month, Integer date){
            this.year = year;
            this.month = month;
            this.date = date;
    }


}
