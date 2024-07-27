package com.codingTest.OOPL.Day07.q2;

public class Square {
    int width, height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return width*height;
    }

    public boolean isSmallerThan(Square s){
        if (s.area() > area())
            return true;
        return false;
    }


}
