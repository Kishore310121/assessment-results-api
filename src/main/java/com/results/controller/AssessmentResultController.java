package com.results.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.results.entity.AssessmentResultEntity;
import com.results.service.AssessmentResultService;

@RestController
@RequestMapping("/assessment-results")
public class AssessmentResultController {
	
	@Autowired
    private AssessmentResultService service;

    @Value("${env}")
    private String env;

    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> addResult(@RequestBody AssessmentResultEntity result) {
        Map<String, Object> response = new HashMap<>();
        try {
            String message = service.addAssessmentResult(result);
            response.put("env", env);
            response.put("error", false);
            response.put("data", message);
            response.put("success", true);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("env", env);
            response.put("error", true);
            response.put("data", "An error occurred. Please try again.");
            response.put("success", false);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/get")
    public ResponseEntity<Map<String, Object>> getAllResults() {
        Map<String, Object> response = new HashMap<>();
        try {
            List<AssessmentResultEntity> results = service.getAllAssessmentResults();
            response.put("env", env);
            response.put("error", false);
            response.put("data", results);
            response.put("success", true);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("env", env);
            response.put("error", true);
            response.put("data", e.getMessage());
            response.put("success", false);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
