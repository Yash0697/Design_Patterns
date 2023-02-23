package com.yash.dp.creational_patterns.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		StudentData studentData = new StudentData();
		studentData.loadStudentData();
		
		StudentData newData = (StudentData) studentData.clone();
		StudentData newData2 = (StudentData) studentData.clone();
		System.out.println(newData);
		System.out.println(newData2);
	}

}
