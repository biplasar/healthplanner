package com.ibm.healthplanner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.healthplanner.model.GetPatientResponse;
import com.ibm.healthplanner.model.Patient;
import com.ibm.healthplanner.repository.HealthPlannerRepository;

@Service
@Transactional
public class HealthPlannerServiceImpl implements HealthPlannerService {
	@Autowired
	HealthPlannerRepository userRepository;

	public void createUser(Patient user) {
		
		System.out.println("Date is :"+user.getDateOfBirth());	
		userRepository.save(user);
	}

	public GetPatientResponse getAllUser() {
		
		GetPatientResponse patietData = new GetPatientResponse();
		patietData.setPatients((List<Patient>) userRepository.findAll());
		return patietData;
	}

	
	 public Optional<Patient> findPatientById(String id) { 
		  return userRepository.findById(id); 
	  }

	public void update(Patient newPatient, String id) {
		
		Optional<Patient> patient = findPatientById(newPatient.getId()); 
		Patient ptn = new Patient();
		  if(patient.isPresent()) {
			  ptn = patient.get();
			  ptn.setId(newPatient.getId());
			  ptn.setName(newPatient.getName());
			  ptn.setAddress(newPatient.getAddress());
			  ptn.setGender(newPatient.getGender());
			  ptn.setDateOfBirth(newPatient.getDateOfBirth());
			  ptn.setMailId(newPatient.getMailId());
			  ptn.setPhone(newPatient.getPhone());
			  ptn.setMaritalStatus(newPatient.getMaritalStatus());
			  ptn.setMedHistory(newPatient.getMedHistory());
		  }
		
		 userRepository.save(ptn);
		
	}

	
	  public void deleteUserById(String id) { 
		  userRepository.deleteById(id);
	  }
	 
	
}
