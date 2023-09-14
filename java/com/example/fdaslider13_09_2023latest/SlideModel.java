package com.example.fdaslider13_09_2023latest;

import java.io.Serializable;

public class SlideModel{  // implements Serializable
int foodimg;
int circleDot;
String textAbove, textBelow;

    public SlideModel(int foodimg, String textAbove, String textBelow) { //int circleDot
        this.foodimg = foodimg;
//        this.circleDot = circleDot;
        this.textAbove = textAbove;
        this.textBelow = textBelow;
    }

    public int getFoodimg() {
        return foodimg;
    }

    public int getCircleDot() {
        return circleDot;
    }

    public String getTextAbove() {
        return textAbove;
    }

    public String getTextBelow() {
        return textBelow;
    }
}
