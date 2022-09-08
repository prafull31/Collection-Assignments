package com.yash.collectionTask7;

public class Student {
	int  rollno;
	String sname; 
	String classname;
	String totalmarks;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(String totalmarks) {
		this.totalmarks = totalmarks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}
	public Student(int rollno, String sname, String classname, String totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}
	public Student() {
		super();
		
	} 
	  
	

}
