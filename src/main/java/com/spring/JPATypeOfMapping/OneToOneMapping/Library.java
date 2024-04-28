package com.spring.JPATypeOfMapping.OneToOneMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Library {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int book_id;
	private String bookName;
	
	@OneToOne
	private Student student;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Library(int book_id, String bookName, Student student) {
		super();
		this.book_id = book_id;
		this.bookName = bookName;
		this.student = student;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
