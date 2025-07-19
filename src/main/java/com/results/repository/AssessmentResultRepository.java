package com.results.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.results.entity.AssessmentResultEntity;

@Repository
public interface AssessmentResultRepository extends JpaRepository<AssessmentResultEntity, Long> {

}
