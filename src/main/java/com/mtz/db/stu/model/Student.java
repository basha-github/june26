package com.mtz.db.stu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int sid;
	private String name;
	private String college;
	private String course;
	private int fee;
	private int maths;
	private int sci;
	private int eng;
	
	public Student() {
		
	}

	public Student(int sid, String name, String college, String course, int fee, int maths, int sci, int eng) {
		super();
		this.sid = sid;
		this.name = name;
		this.college = college;
		this.course = course;
		this.fee = fee;
		this.maths = maths;
		this.sci = sci;
		this.eng = eng;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	
	
	
	
	
}
