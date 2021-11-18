package com.demo.onlineexamportal.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

public class UserHistory {

private int testscore;
private Date testdate;
@OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
public int getTestscore() {
	return testscore;
}
public void setTestscore(int testscore) {
	this.testscore = testscore;
}
public Date getTestdate() {
	return testdate;
}
public void setTestdate(Date testdate) {
	this.testdate = testdate;
}
}
