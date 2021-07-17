package com.rcv.rwxls;

public class Employee {

	String iD;
	String name;
	String role;
	String age;
	
	public Employee (String iD, String name, String role, String age)
	{
		this.iD=iD;
		this.name=name;
		this.role=role;
		this.age=age;
	}
	public String getID() {
		return iD;
	}
	public void setID(String iD) {
		iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
