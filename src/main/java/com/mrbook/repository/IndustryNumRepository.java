package com.mrbook.repository;

import com.mrbook.entity.IndustryNum;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IndustryNumRepository {
    public List<IndustryNum> getAllByCityName(String city) {
        if (city.equals("成都")) {
            List<IndustryNum> list = new ArrayList<>();
            list.add(new IndustryNum("互联网", 2000));
            list.add(new IndustryNum("通信/电子", 1200));
            list.add(new IndustryNum("贸易", 1000));
            list.add(new IndustryNum("机械/制造", 800));
            list.add(new IndustryNum("房地产", 1700));
            list.add(new IndustryNum("金融", 1500));
            list.add(new IndustryNum("教育", 900));
            list.add(new IndustryNum("a", 1000));
            list.add(new IndustryNum("b", 1100));
            list.add(new IndustryNum("c", 1200));
            list.add(new IndustryNum("d", 1300));
            return list;
        } else {
            List<IndustryNum> list = new ArrayList<>();
            list.add(new IndustryNum("互联网", 2500));
            list.add(new IndustryNum("通信/电子", 1800));
            list.add(new IndustryNum("贸易", 1720));
            list.add(new IndustryNum("机械/制造", 1200));
            list.add(new IndustryNum("房地产", 1450));
            list.add(new IndustryNum("金融", 2200));
            list.add(new IndustryNum("教育", 1500));
            return list;
        }
    }
}
