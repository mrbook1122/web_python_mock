package com.mrbook.repository;

import com.mrbook.entity.Year;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class YearRepository {
    public List<Year> getAllYears(String industry) {
        String[] s = new String[]{
                "2016Q4", "2017Q1", "2017Q2",
                "2017Q3", "2017Q4", "2018Q1",
                "2018Q2", "2018Q3", "2018Q4",
                "2019Q1"
        };
        List<Year> years = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            years.add(new Year(s[i], new Random().nextInt(20) * 100 + 2000));
        }
        return years;
    }
}
