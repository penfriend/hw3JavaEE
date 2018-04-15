package com.DianaGolik.hw3;

public class Teacher {
	private String tName;

	public Teacher() {
		// TODO Auto-generated constructor stub
		settName("Petrenko");
	}
public String toString() {
	return "Teacher's name is "+tName;
}
public String gettName() {
	return tName;
}
public void settName(String tName) {
	this.tName = tName;
}
}
