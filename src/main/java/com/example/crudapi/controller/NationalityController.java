package com.example.crudapi.controller;

import com.example.crudapi.entity.Nationality;
import com.example.crudapi.service.NationalityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NationalityController {

    private final NationalityService nationalityService;

    public NationalityController(NationalityService nationalityService){
        this.nationalityService = nationalityService;
    }

    @GetMapping("/nationality")
    public List<Nationality> geyNationalities() {
        List<Nationality> nationalities = nationalityService.getNames();
        return nationalities;
    }

}
