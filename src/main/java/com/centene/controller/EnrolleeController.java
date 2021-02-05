package com.centene.controller;

import com.centene.dto.EnrolleeDTO;
import com.centene.model.EnrolleeEntity;
import com.centene.service.EnrolleeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EnrolleeController {

    private EnrolleeService enrolleeService;

    @Autowired
    public EnrolleeController(EnrolleeService enrolleeService) {
        this.enrolleeService = enrolleeService;
    }

    @PostMapping("/test")
    public EnrolleeEntity addEnrollee(@RequestBody EnrolleeDTO enrolleeDTO) {
        return enrolleeService.addDependent(enrolleeDTO);
    }

    @PutMapping(value = "")
    public String modifyEnrolllee(){
        return "fone";
    }

    @DeleteMapping(value = "vsvs")
    public boolean removeEnrollee(){
        return false;
    }


}
