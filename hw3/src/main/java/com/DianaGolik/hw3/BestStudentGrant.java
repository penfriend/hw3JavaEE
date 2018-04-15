package com.DianaGolik.hw3;

import org.springframework.beans.factory.annotation.Autowired;


public class BestStudentGrant {
	
	private Prize grantAmount;
	private Student stud;

	
	public BestStudentGrant(Prize grantAmount) {
		// TODO Auto-generated constructor stub
		//this.grantAmount=null;
		this.grantAmount = grantAmount;
	}


	public Prize getGrantAmount() {
		return grantAmount;
	}
	
	@Autowired
	public void setGrantAmount(Prize grantAmount) {
		//this.grantAmount = null;
		this.grantAmount = grantAmount;

	}

	public Student getStud() {
		return stud;
	}

	@Autowired
	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	public String toString() {
		return "Student "+stud.getStudName()+" is granted with amount "+grantAmount;
	}

}
