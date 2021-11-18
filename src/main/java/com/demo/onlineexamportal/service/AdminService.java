package com.demo.onlineexamportal.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.onlineexamportal.entity.Admin;
import com.demo.onlineexamportal.entity.TestMgmt;
import com.demo.onlineexamportal.entity.TestPaper;
import com.demo.onlineexamportal.entity.User;




	public interface AdminService {
		public void addAdmin(Admin admin);
		
		public List<User> getAllUsers();
        public String adminLogin(Admin admin);
        public String addNewTest(TestPaper testPaper);
        public String removeTestPaper(String courseType, Integer testpaper_code);
        public String removeQuestionById(Integer id);
	   
	
}









