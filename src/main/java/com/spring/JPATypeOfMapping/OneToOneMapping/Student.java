package com.spring.JPATypeOfMapping.OneToOneMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int Student_id;
	private String StudentName;
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Student(int student_id, String studentName) {
		super();
		Student_id = student_id;
		StudentName = studentName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
