package com.demo.onlineexamportal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.onlineexamportal.dao.UserRepo;
import com.demo.onlineexamportal.entity.User;
import com.demo.onlineexamportal.exceptions.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepository;

	@Override
	public boolean userLogin(String username, String password) {

		User user = userRepository.findByUsername(username);

		if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	@Override
	public User userRegister(User user) {
		return userRepository.save(user);

	}

	@Override
	public User updateUserDetails(User user)  {

		Optional<User> userop = userRepository.findById(user.getId());
		if(userop.isPresent()) {
		if(user.getEmail() != null)
		{
			user.setEmail(user.getEmail());
		}
		
		if(user.getFirstName() != null)
		{
			user.setFirstName(user.getFirstName());
		}

		if(user.getLastName() != null)
		{
			user.setLastName(user.getLastName());
		}
	
		if(user.getPassword() != null)
		{
			user.setPassword(user.getPassword());
		}
		
		if(user.getUsername() != null)
		{
			user.setUsername(user.getUsername());
		}
		
		return userRepository.save(user);
	}
	
	throw new UserNotFoundException("User Not Found");


}

