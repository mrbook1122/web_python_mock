package com.mrbook.entity;

public class Year {
    private String time;
    private int num;

    public Year(String time, int num) {
        this.time = time;
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
