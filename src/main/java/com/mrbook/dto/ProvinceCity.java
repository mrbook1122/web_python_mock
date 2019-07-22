package com.mrbook.dto;

public class ProvinceCity {
    private String province;
    private String[] cities;

    public ProvinceCity(String province, String[] cities) {
        this.province = province;
        this.cities = cities;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}
