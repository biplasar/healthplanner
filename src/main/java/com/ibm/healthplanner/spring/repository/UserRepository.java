package com.ibm.healthplanner.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.healthplanner.spring.bean.User;
public interface UserRepository extends CrudRepository<User, String>{

}
