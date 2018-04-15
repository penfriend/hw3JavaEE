package com.DianaGolik.hw3;

public class Subject {
	private String subjectName;
	private int credits;
	private Teacher teacher;

	public Subject(String name,int credits) {
		// TODO Auto-generated constructor stub
		this.subjectName=name;
		this.setCredits(credits);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String toString() {
		return "Name of the subject: "+subjectName+", credits: "+credits+", "
				+"teacher " + teacher;
	}


	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
