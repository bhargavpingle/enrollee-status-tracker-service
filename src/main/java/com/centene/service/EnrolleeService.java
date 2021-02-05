package com.centene.service;

import com.centene.dto.EnrolleeDTO;
import com.centene.model.EnrolleeEntity;
import com.centene.repository.EnrolleeJpaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrolleeService {
    private EnrolleeJpaRespository enrolleeJpaRespository;

    @Autowired
    public EnrolleeService(EnrolleeJpaRespository enrolleeJpaRespository) {
        this.enrolleeJpaRespository = enrolleeJpaRespository;
    }

    public EnrolleeEntity addDependent(EnrolleeDTO enrolleeDTO){
        EnrolleeEntity enrolleeEntity = new EnrolleeEntity(enrolleeDTO.getId(), enrolleeDTO.getName(),
                enrolleeDTO.isActivationStatus(), enrolleeDTO.getBirthDate(), enrolleeDTO.getDependentEntities());
        return enrolleeJpaRespository.save(enrolleeEntity);
    }

    public EnrolleeEntity updateDependents(EnrolleeDTO enrolleeDTO){
        EnrolleeEntity enrolleeEntity = new EnrolleeEntity(enrolleeDTO.getId(), enrolleeDTO.getName(),
                enrolleeDTO.isActivationStatus(), enrolleeDTO.getBirthDate(), enrolleeDTO.getDependentEntities());
        return enrolleeJpaRespository.save(enrolleeEntity);
    }

    public void deleteDependents(Long id){
        enrolleeJpaRespository.deleteById(id);
    }
}
