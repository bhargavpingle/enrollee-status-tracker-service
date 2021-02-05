package com.centene.repository;

import com.centene.model.DependentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependentJpaRepository extends JpaRepository<DependentEntity, Long> {
}
