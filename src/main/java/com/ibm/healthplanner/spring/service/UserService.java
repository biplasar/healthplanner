package com.ibm.healthplanner.spring.service;

import java.util.List;
import java.util.Optional;

import com.ibm.healthplanner.spring.bean.GetPatientResponse;
import com.ibm.healthplanner.spring.bean.Patient;

public interface UserService {
	public void createUser(Patient user);
	public GetPatientResponse getAllUser();
	public Optional<Patient> findPatientById(String id);
	public void update(Patient patient, String id);
	public void deleteUserById(String id);
	//public User updatePartially(User user, String id);
}
