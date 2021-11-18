package com.demo.onlineexamportal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "TestMgmt")
public class TestMgmt {
	@Id
	private int Test_id;
	private char CourseType;
	public TestMgmt(int Id, char courseType) {
		super();
		Test_id = Id;
		CourseType = courseType;
	}
	public int getTest_Id() {
		return Test_id;
	}
	public void setTest_Id(int test_Id) {
		Test_id = test_Id;
	}
	@OneToOne(targetEntity = Question.class, cascade = CascadeType.ALL)
	public char getCourseType() {
		return CourseType;
	}
	public void setCourseType(char courseType) {
		CourseType = courseType;
	}
	@Override
	public String toString() {
		return "TestMgmt [Test_Id=" + Test_id + ", CourseType=" + CourseType + "]";
	}
	public static Object add() {
		// TODO Auto-generated method stub
		return null;
	}
}