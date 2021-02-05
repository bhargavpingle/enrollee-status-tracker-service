package com.centene.service;

import com.centene.dto.DependentDTO;
import com.centene.model.DependentEntity;
import com.centene.repository.DependentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DependentService {
    private DependentJpaRepository dependentJpaRepository;

    @Autowired
    public DependentService(DependentJpaRepository dependentJpaRepository) {
        this.dependentJpaRepository = dependentJpaRepository;
    }

    //adds the entity if doesnt exist otherwise returns null
    public DependentEntity addDependent(DependentDTO dependentDTO){
        if(dependentJpaRepository.findById(dependentDTO.getId()).isPresent()){
            return null;
        }
        DependentEntity dependentEntity = new DependentEntity(dependentDTO.getId(), dependentDTO.getName(),
                                                                dependentDTO.getBirthDate());
            return dependentJpaRepository.save(dependentEntity);
    }

    //updates entity if it exits otherwise adds new entity
    public DependentEntity updateDependents(DependentDTO dependentDTO){
        DependentEntity dependentEntity = new DependentEntity(dependentDTO.getId(), dependentDTO.getName(),
                                                dependentDTO.getBirthDate());
        return dependentJpaRepository.save(dependentEntity);
    }

    public void deleteDependents(Long id){
        dependentJpaRepository.deleteById(id);
    }
}
