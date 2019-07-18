package com.mrbook.entity;

public class IndustryNum {
    private String industry;
    private int num;

    public IndustryNum(String industry, int num) {
        this.industry = industry;
        this.num = num;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
