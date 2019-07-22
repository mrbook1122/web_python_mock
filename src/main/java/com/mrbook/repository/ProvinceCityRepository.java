package com.mrbook.repository;

import com.mrbook.dto.ProvinceCity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProvinceCityRepository {
    public List<ProvinceCity> getAll() {
        List<ProvinceCity> result = new ArrayList<>();
        String[] sichuancity = new String[]{
                "成都", "南充", "绵阳", "达州"
        };
        ProvinceCity sichuan = new ProvinceCity("四川", sichuancity);
        result.add(sichuan);
        String[] jiangsucity = new String[]{
                "南京", "常州", "无锡"
        };
        ProvinceCity jiangsu = new ProvinceCity("江苏", jiangsucity);
        result.add(jiangsu);
        String[] s = new String[0];
        result.add(new ProvinceCity("北京", s));
        return result;
    }
}
