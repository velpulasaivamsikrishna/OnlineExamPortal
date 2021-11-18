package com.demo.onlineexamportal.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.onlineexamportal.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);
	
	User findBypassword(String password);
	
	User findById(int id);

}

