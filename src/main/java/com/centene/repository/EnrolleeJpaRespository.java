package com.centene.repository;

import com.centene.model.EnrolleeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrolleeJpaRespository extends JpaRepository<EnrolleeEntity, Long> {
}
