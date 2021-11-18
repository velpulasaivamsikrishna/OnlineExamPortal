package com.demo.onlineexamportal.service;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.onlineexamportal.dao.AdminRepository;
import com.demo.onlineexamportal.dao.TestMgmtRepository;
import com.demo.onlineexamportal.dao.TestPaperRepo;
import com.demo.onlineexamportal.dao.TestQuestionRepo;
import com.demo.onlineexamportal.dao.UserRepo;
import com.demo.onlineexamportal.entity.Admin;
import com.demo.onlineexamportal.entity.TestMgmt;
import com.demo.onlineexamportal.entity.TestPaper;
import com.demo.onlineexamportal.entity.TestQuestion;
import com.demo.onlineexamportal.entity.User;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminRepository adminRepository;

	protected  boolean isLogin = false;

	@Autowired
	TestPaperRepo testPaperRepository;

	@Autowired
	TestQuestionRepo testQuestionRepository;

	@Autowired
	UserRepo userRepository;
	
	@Autowired
	TestMgmtRepository testRepository;

	
    @Override
	public void addAdmin(Admin admin) {

		adminRepository.save(admin);
	}

    @Override
	public String adminLogin(Admin admin) {

		Admin a1 = adminRepository.findByUserName(admin.getUserName());

		if(a1.getPassword().equals(admin.getPassword()))
		{
			isLogin = true;
			return "You're Successfully Logged in as a Administartor";
		}
		else
		{	
			return "Unsuccessful Authentication";
		}

	}

    @Override
	public String addNewTest(TestPaper testPaper) {
		if (isLogin) {
			testPaperRepository.save(testPaper);
			return "Success";
		} else {
			return "You Must be Logged in as Administrator";
		}
	}
	
    @Override
    @Transactional
	public String removeTestPaper(String courseType, Integer testpaper_code) {
		if (isLogin) {
			testPaperRepository.deleteByTestPaperCode(testpaper_code);
			return "Deleted Test Paper code = " + testpaper_code;
		} else {
			return "You Must be Logged in as Administrator.";
		}
	}
	
    @Override
    @Transactional
	public String removeQuestionById(Integer id) {
		if (isLogin) {
			TestQuestion que = testQuestionRepository.findById(id);
			if(que != null)
			{
				testQuestionRepository.deleteById(id);
				return "true";
			}
			return "false";
		} else {
			return "You Must be Logged in as Administrator..";
		}
	}

	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

}

























