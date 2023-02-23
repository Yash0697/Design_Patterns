package com.yash.dp.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentData implements Cloneable {

	private List<Student> studentList;
	
	public StudentData() {
		studentList = new ArrayList<Student>();
	}
	
	public StudentData(List<Student> students) {
		this.studentList = students;
	}
	
	public void loadStudentData() {
		studentList.add(new Student(121L, "Yashendra", "CSE", 8.1));
		studentList.add(new Student(123L, "Zakir", "CE", 7.1));
		studentList.add(new Student(1L, "Abhishek", "ME", 7.4));
	}
	
	public List<Student> getStudentData() {
		return this.studentList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<Student> cloned = new ArrayList<Student>();
		for(Student s: this.studentList) {
			cloned.add(s);
		}
		return cloned;
	}
}
