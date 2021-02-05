package com.centene.controller;


import com.centene.dto.DependentDTO;
import com.centene.model.DependentEntity;
import com.centene.service.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DependentController {

    private DependentService dependentService;

    @Autowired
    public DependentController(DependentService dependentService) {
        this.dependentService = dependentService;
    }

    @PostMapping(value="/dependents")
    public DependentEntity addDependent(@RequestBody DependentDTO dependentDTO){
        return  dependentService.addDependent(dependentDTO);
    }

    @PutMapping(value = "/dependents")
    public DependentEntity modifyDependent(@RequestBody DependentDTO dependentDTO){
        return dependentService.updateDependents(dependentDTO);
    }

    @DeleteMapping(value = "/dependents/{id}")
    public void removeDependent(@PathVariable Long id){
        dependentService.deleteDependents(id);
    }
}
