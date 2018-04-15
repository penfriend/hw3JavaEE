package com.DianaGolik.hw3;

public class Student {
	private String studName;
	private RecordBook recBook;
	

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.studName=name;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


	public RecordBook getRecBook() {
		return recBook;
	}


	public void setRecBook(RecordBook recBook) {
		this.recBook = recBook;
	}

	public String toString() {
		return "Student: "+getStudName();
	}
}
