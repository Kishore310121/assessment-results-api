package com.results.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.results.entity.AssessmentResultEntity;
import com.results.repository.AssessmentResultRepository;

@Service
public class AssessmentResultService {
	
	@Autowired
    private AssessmentResultRepository repository;

    public String addAssessmentResult(AssessmentResultEntity result) {
        repository.save(result);
        return "Assessment Result added Successfully";
    }

    public List<AssessmentResultEntity> getAllAssessmentResults() {
        return repository.findAll();
    }
}
