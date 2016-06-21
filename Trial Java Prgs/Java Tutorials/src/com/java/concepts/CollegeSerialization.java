package com.java.concepts;

import java.io.Serializable;

public class CollegeSerialization implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -71669861580305309L;
	
	private String collegeName;
	private int collegeNo;
	private Integer salary;
	private int noOfClass;
	private static int noOfTeacher;
	private transient int noOfStudents;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeNo() {
		return collegeNo;
	}
	public void setCollegeNo(int collegeNo) {
		this.collegeNo = collegeNo;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public int getNoOfClass() {
		return noOfClass;
	}
	public void setNoOfClass(int noOfClass) {
		this.noOfClass = noOfClass;
	}
	public static int getNoOfTeacher() {
		return noOfTeacher;
	}
	public static void setNoOfTeacher(int noOfTeacher) {
		CollegeSerialization.noOfTeacher = noOfTeacher;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
}
