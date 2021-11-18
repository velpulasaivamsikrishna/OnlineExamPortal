package com.demo.onlineexamportal.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.demo.onlineexamportal.entity.Admin;

public interface TestMgmtRepository extends CrudRepository<Admin,Integer>{
	

}