package com.mrbook.repository;

import com.mrbook.entity.Record;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RecordRepository {
    private String getPro() {
        String[] s = new String[]{
                "四川", "云南", "重庆", "江苏", "广州",
                "湖南", "湖北", "山西"
        };
        return s[new Random().nextInt(s.length)];
    }

    private String getCity() {
        String[] s = new String[]{
                "成都", "南充", "绵阳", "达州", "南京",
                "常州", "无锡", "盐城"
        };
        return s[new Random().nextInt(s.length)];
    }

    public List<Record> getAll(int page) {
        List<Record> records = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Record record = new Record(i, "行业" + (i * 2),
                    "职业" + (i * 2), getPro(), getCity(),
                    new Random().nextInt(100) * 20 + 1000);
            records.add(record);
        }
        return records;
    }
}
