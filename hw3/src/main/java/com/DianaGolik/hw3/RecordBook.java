package com.DianaGolik.hw3;

import java.util.Map;

public class RecordBook {
	private int idRecordB;
	private Map<Subject, Degree> records;

	public RecordBook(int id) {
		// TODO Auto-generated constructor stub
		this.setIdRecordB(id);
	}

	public int getIdRecordB() {
		return idRecordB;
	}

	public void setIdRecordB(int idRecordB) {
		this.idRecordB = idRecordB;
	}

	public Map<Subject, Degree> getRecords() {
		return records;
	}

	public void setRecords(Map<Subject, Degree> records) {
		this.records = records;
	}
	
	public String toString() {
		return "record book id: "+idRecordB;
	}
	

}
