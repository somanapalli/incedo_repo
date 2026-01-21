package com.incedo.cfw;

public class Student implements Comparable<Student> {

	private Integer stid;
	private String stname;
	
	
	public Student(Integer stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	
	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	@Override
	public String toString()
	{
		return stid + " " + stname;
		
	}

	@Override
	public int compareTo(Student o) {
		
		//return this.getStname().compareTo(o.getStname());
	
	    return this.getStid().compareTo(o.getStid());
	}
	
	
}
