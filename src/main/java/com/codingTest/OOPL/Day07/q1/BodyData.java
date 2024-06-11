package com.codingTest.OOPL.Day07.q1;

public class BodyData {
    private int weight, height;

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height;}

    public int idealWeight() {
        return height-110;
    }

    public boolean needDiet(){
        if (weight > idealWeight()) {
            return true;
        }
        return false;
    }

    public boolean isTallerThan(BodyData b){
        if (b.height < height) {
            return true;
        }
        return false;
    }


}