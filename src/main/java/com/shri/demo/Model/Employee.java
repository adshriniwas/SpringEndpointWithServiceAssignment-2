package com.shri.demo.Model;

public class Employee {
	
	private String empName;
	private int id;
	private String address;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, int id, String address) {
		super();
		this.empName = empName;
		this.id = id;
		this.address = address;
	}
	
	

}
