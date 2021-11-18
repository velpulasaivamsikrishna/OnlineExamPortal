package com.demo.onlineexamportal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.onlineexamportal.entity.User;
import com.demo.onlineexamportal.service.AdminService;
import com.demo.onlineexamportal.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
   
	private UserService userService;
	public AdminService adminService;
	@GetMapping("/getAllUsers")
	public List<User> getAllEmp(){
		return adminService.getAllUsers();
	}
   
	@PostMapping(path="/login")
    public Object login(@RequestBody String username, String password){
        return userService.userLogin(username, password);
}
   
	@PostMapping(path = "/Registration")
    public Object register(@RequestBody User user ){
        return userService.updateUserDetails( user);
    }
}
   
