package com.mrbook.controller;

import com.mrbook.entity.Job;
import com.mrbook.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private JobRepository jobRepository;

    @RequestMapping("/job/rank")
    public List<Job> jobs(@RequestParam String city) {
        return jobRepository.getAllJob();
    }
}
