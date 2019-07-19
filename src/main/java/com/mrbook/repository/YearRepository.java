package com.mrbook.repository;

import com.mrbook.entity.Year;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class YearRepository {
    public List<Year> getAllYears(String industry) {
        if (industry.equals("互联网")) {

        }
        return null;
    }
}
