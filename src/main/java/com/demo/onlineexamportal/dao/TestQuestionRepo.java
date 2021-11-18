package com.demo.onlineexamportal.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.onlineexamportal.entity.TestQuestion;

public interface TestQuestionRepo extends CrudRepository<TestQuestion,String> {

    void deleteById(Integer id);

    TestQuestion findById(Integer id);

}
