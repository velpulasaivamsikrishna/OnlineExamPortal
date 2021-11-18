package com.demo.onlineexamportal.entity;

import java.sql.Date;

public class Result {
private int User_Id;
private int Test_Id;
private int question_id;
private Date ExamDate;
private int ExamScore;

public Result(int user_Id, int test_Id, int question_id, Date examDate, int examScore) {
	super();
	User_Id = user_Id;
	Test_Id = test_Id;
	this.question_id = question_id;
	ExamDate = examDate;
	ExamScore = examScore;
}
public int getUser_Id() {
	return User_Id;
}
public void setUser_Id(int user_Id) {
	User_Id = user_Id;
}
public int getTest_Id() {
	return Test_Id;
}
public void setTest_Id(int test_Id) {
	Test_Id = test_Id;
}
public int getQuestion_id() {
	return question_id;
}
public void setQuestion_id(int question_id) {
	this.question_id = question_id;
}
public Date getExamDate() {
	return ExamDate;
}
public void setExamDate(Date examDate) {
	ExamDate = examDate;
}
public int getExamScore() {
	return ExamScore;
}
public void setExamScore(int examScore) {
	ExamScore = examScore;
}
@Override
public String toString() {
	return "Result [User_Id=" + User_Id + ", Test_Id=" + Test_Id + ", question_id=" + question_id + ", ExamDate="
			+ ExamDate + ", ExamScore=" + ExamScore + "]";
}
}
