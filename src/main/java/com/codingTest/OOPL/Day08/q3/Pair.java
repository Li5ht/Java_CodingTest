package com.codingTest.OOPL.Day08.q3;

public class Pair {
    private Integer x, y;

    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }
    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }

    Pair(){
        this.x = 0;
        this.y = 0;
    }

    Pair (Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    public String toStirng(){
        return "(" + x + ", " + y + ")" ;
    }

    public static Pair add(Pair a, Pair b){
        Pair rslt = new Pair(a.x + b.x, a.y+b.y);

        return rslt;
    }

    public static Pair sub(Pair a, Pair b){
        Pair rslt = new Pair(a.x - b.x, a.y-b.y);

        return rslt;
    }

    public static Pair mult(Pair a, Pair b){
        Pair rslt = new Pair(a.x * b.x, a.y * b.y);

        return rslt;
    }

    public static Pair div(Pair a, Pair b){
        Pair rslt = new Pair(a.x / b.x, a.y / b.y);

        return rslt;
    }


}
