package com.yash.dp.creational_patterns.prototype;

public class Student {

	private Long rollNo;
	private String name;
	private String branch;
	private Double cgpa;
	public Student(Long rollNo, String name, String standard, Double cgpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = standard;
		this.cgpa = cgpa;
	}
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String standard) {
		this.branch = standard;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	
	
}
