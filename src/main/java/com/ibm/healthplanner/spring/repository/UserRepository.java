package com.ibm.healthplanner.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.ibm.healthplanner.spring.bean.CreatePatientResponse;
import com.ibm.healthplanner.spring.bean.Patient;
public interface UserRepository extends MongoRepository<Patient, String>{

}
