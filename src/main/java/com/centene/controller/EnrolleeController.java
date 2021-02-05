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

    @PostMapping("/enrollees")
    public EnrolleeEntity addEnrollee(@RequestBody EnrolleeDTO enrolleeDTO) {
        return enrolleeService.addEnrollee(enrolleeDTO);
    }

    @PutMapping(value = "/enrollees")
    public EnrolleeEntity modifyEnrolllee(@RequestBody EnrolleeDTO enrolleeDTO){
        return enrolleeService.updateEnrollee(enrolleeDTO);
    }

    @DeleteMapping(value = "/enrollees/{id}")
    public void removeEnrollee(@PathVariable Long id){
        enrolleeService.deleteEnrollee(id);
    }


}
