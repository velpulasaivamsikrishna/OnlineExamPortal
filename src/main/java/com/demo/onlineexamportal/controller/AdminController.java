package com.demo.onlineexamportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.onlineexamportal.DTO.TestDTO;
import com.demo.onlineexamportal.entity.Admin;
import com.demo.onlineexamportal.entity.TestPaper;
import com.demo.onlineexamportal.service.AdminService;
@RestController
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
    private AdminService adminservice;
    @PostMapping(path="/adminlogin")
    public Object adminlogin(@RequestBody Admin adminlogin){
        return adminservice.adminLogin(adminlogin);
}
    @PostMapping(path="/createtest")
    public Object addNewTest(@RequestBody TestPaper testcreation){
        return adminservice.addNewTest(testcreation);
}
    @RequestMapping(path="/removetest",method=RequestMethod.POST)
    public Object removeTestPaper(@RequestBody TestDTO test ){
        return adminservice.removeTestPaper(test.course, test.code);
}
    @PostMapping(path="/removeQuestion")
    public Object removeQuestionById(@RequestBody Integer id){
        return adminservice.removeQuestionById(id);
}
}