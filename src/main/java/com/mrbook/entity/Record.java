package com.mrbook.entity;

public class Record {
    private int key;
    private String industry;
    private String job;
    private String province;
    private String city;
    private int salary;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Record(int key, String industry, String job, String province, String city, int salary) {
        this.key = key;
        this.industry = industry;
        this.job = job;
        this.province = province;
        this.city = city;
        this.salary = salary;
    }
}
