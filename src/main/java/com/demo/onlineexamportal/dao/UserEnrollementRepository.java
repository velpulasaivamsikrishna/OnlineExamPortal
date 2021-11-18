package com.demo.onlineexamportal.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.onlineexamportal.entity.User;

public interface UserEnrollementRepository extends CrudRepository<User,Integer>{

}
