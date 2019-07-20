package com.mrbook.controller;

import com.mrbook.entity.IndustryNum;
import com.mrbook.entity.Job;
import com.mrbook.entity.Year;
import com.mrbook.repository.IndustryNumRepository;
import com.mrbook.repository.JobRepository;
import com.mrbook.repository.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/industry")
public class AreaController {
    @Autowired
    private IndustryNumRepository industryNumRepository;

    @Autowired
    private YearRepository yearRepository;

    @Autowired
    private JobRepository jobRepository;

    @RequestMapping("/num")
    public List<IndustryNum> nums(@RequestParam String city) {
        return industryNumRepository.getAllByCityName(city);
    }

    @RequestMapping("/time")
    public List<Year> time(@RequestParam String industry, @RequestParam String city) {
        return yearRepository.getAllYears("");
    }



}
