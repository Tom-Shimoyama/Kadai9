package com.example.crudapi.service;

import com.example.crudapi.mapper.NationalityMapper;
import com.example.crudapi.entity.Nationality;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalityService {

    private final NationalityMapper nationalityMapper;

    public NationalityService(NationalityMapper nationalityMapper) {
        this.nationalityMapper = nationalityMapper;
    }

    public List<Nationality> getNames() {
        List<Nationality> nationalities = nationalityMapper.findAll();
        return nationalities;
    }

}
