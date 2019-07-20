package com.mrbook.repository;

import com.mrbook.entity.Job;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class JobRepository {
    public List<Job> getAllJob() {
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Job job = new Job("job" + 1,
                    new Random().nextInt(10) * 20 + 1000,
                    new Random().nextInt(10) * 20 + 1000);
            jobs.add(job);
        }
        return jobs;
    }
}
