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

    //adds the entity if doesnt exist otherwise returns null
    public EnrolleeEntity addEnrollee(EnrolleeDTO enrolleeDTO){
        if(enrolleeJpaRespository.findById(enrolleeDTO.getId()).isPresent()){
            return null;
        } else {
            EnrolleeEntity enrolleeEntity = new EnrolleeEntity(enrolleeDTO.getId(), enrolleeDTO.getName(),
                    enrolleeDTO.isActivationStatus(), enrolleeDTO.getBirthDate(), enrolleeDTO.getDependentEntities());
            return enrolleeJpaRespository.save(enrolleeEntity);
        }
    }

    //updates entity if it exits otherwise adds new entity
    public EnrolleeEntity updateEnrollee(EnrolleeDTO enrolleeDTO){
            EnrolleeEntity enrolleeEntity = new EnrolleeEntity(enrolleeDTO.getId(), enrolleeDTO.getName(),
                    enrolleeDTO.isActivationStatus(), enrolleeDTO.getBirthDate(), enrolleeDTO.getDependentEntities());
            return enrolleeJpaRespository.save(enrolleeEntity);
    }

    public void deleteEnrollee(Long id){
        enrolleeJpaRespository.deleteById(id);
    }
}
