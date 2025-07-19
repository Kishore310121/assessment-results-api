package com.results.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "assessment_results")
@Data
public class AssessmentResultEntity {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String quarterYear;
	    private String controlId;
	    private String quarterYearControlIdProviderEntityAssessmentType;
	    private String cOwner;
	    private String cOversight;
	    private String selfAssessment;
	    private String kpiAssessment;
	    private String kpiPeriod;
	    private String complianceAssessment;
	    private String assessmentType;
	    private String assessmentCoveragePeriod;
	    private String assId;

}
