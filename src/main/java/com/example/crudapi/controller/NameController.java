package com.example.crudapi.controller;

import com.example.crudapi.entity.Name;
import com.example.crudapi.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<Name> getNames() {
        List<Name> names = nameService.getNames();
        return names;
    }
}
