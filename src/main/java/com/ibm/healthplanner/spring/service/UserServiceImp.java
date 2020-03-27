package com.ibm.healthplanner.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.healthplanner.spring.bean.GetPatientResponse;
import com.ibm.healthplanner.spring.bean.Patient;
import com.ibm.healthplanner.spring.repository.UserRepository;

@Service
@Transactional
public class UserServiceImp implements UserService {
	@Autowired
	UserRepository userRepository;

	public void createUser(Patient user) {

		userRepository.save(user);
	}

	public GetPatientResponse getAllUser() {
		// TODO Auto-generated method stub
		
		GetPatientResponse data = new GetPatientResponse();
		data.setPatients((List<Patient>) userRepository.findAll());
		return data;
	}

	
	 public Optional<Patient> findPatientById(String id) { // TODO Auto-generated method
		  return userRepository.findById(id);  
	  }

	public void update(Patient newPatient, String id) {
		Optional<Patient> patient = findPatientById(newPatient.getId()); 
		Patient ptn = new Patient();
		  if(patient.isPresent()) {
			  ptn = patient.get();
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
		//return userRepository.save(user);
	}

	
	  public void deleteUserById(String id) { // TODO Auto-generated method stub
		  userRepository.deleteById(id);
	  }
	 
	/*
	 * public User updatePartially(User user, String id) { // TODO Auto-generated
	 * method stub User usr = findById(id); usr.setCountry(user.getCountry());
	 * return userRepository.save(usr); }
	 */



}
