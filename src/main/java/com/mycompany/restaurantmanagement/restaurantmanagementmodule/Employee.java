package com.mycompany.restaurantmanagement.restaurantmanagementmodule;

public class Employee {
	
	private String id;
	private String name;
	private DepartmentInterface dept;
	private DESIGNATION designation;
	
	public Employee(String id, String name, DepartmentInterface dept, DESIGNATION designation) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public DESIGNATION getDesignation() {
		return designation;
	}
	
	public void setDesignation(DESIGNATION desg) {
		this.designation = desg;
	}
	
	public DepartmentInterface getDept() {
		return dept;
	}
	public void setDept(DepartmentInterface dept) {
		this.dept = dept;
	}
	
	
}
