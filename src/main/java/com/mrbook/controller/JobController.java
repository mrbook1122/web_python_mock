package com.mrbook.controller;

import com.mrbook.dto.ListResult;
import com.mrbook.dto.ProvinceCity;
import com.mrbook.entity.Job;
import com.mrbook.repository.JobRepository;
import com.mrbook.repository.ProvinceCityRepository;
import com.mrbook.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private ProvinceCityRepository provinceCityRepository;

    @RequestMapping("/job/rank")
    public List<Job> jobs(@RequestParam String city) {
        return jobRepository.getAllJob();
    }

    @RequestMapping("/list")
    public ListResult list(
            @RequestParam int page,
            @RequestParam(required = false) String industry,
            @RequestParam(required = false) String job,
            @RequestParam(required = false) String province,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String salary) {
        return new ListResult(50, recordRepository.getAll(page));
    }

    @RequestMapping("/city")
    public List<ProvinceCity> city() {
        return provinceCityRepository.getAll();
    }
}
