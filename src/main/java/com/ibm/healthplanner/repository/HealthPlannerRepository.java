package com.ibm.healthplanner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.healthplanner.model.Patient;


@Repository
public interface HealthPlannerRepository extends MongoRepository<Patient, String>{

	
}
