package com.centene.repository;

import com.centene.model.EnrolleeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EnrolleeJpaRespository extends JpaRepository<EnrolleeEntity, Long> {
}
