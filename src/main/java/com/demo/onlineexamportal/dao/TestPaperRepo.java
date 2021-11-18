package com.demo.onlineexamportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.demo.onlineexamportal.entity.TestPaper;

public interface TestPaperRepo extends JpaRepository<TestPaper,String>{

	

	public void deleteByTestPaperCode(Integer testpaper_code);

}
