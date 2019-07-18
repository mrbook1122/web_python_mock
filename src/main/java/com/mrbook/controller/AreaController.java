package com.mrbook.controller;

import com.mrbook.entity.IndustryNum;
import com.mrbook.repository.IndustryNumRepository;
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

    @RequestMapping("/num")
    public List<IndustryNum> nums(@RequestParam String city) {
        return industryNumRepository.getAllByCityName(city);
    }


}
