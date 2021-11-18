package com.demo.onlineexamportal.service;

import java.util.List;


import com.demo.onlineexamportal.entity.User;
import com.demo.onlineexamportal.exceptions.UserNotFoundException;


public interface UserService {



	
	boolean userLogin(String username,String password) ;
	User userRegister(User user);
	User updateUserDetails(User user) ;
	

}
