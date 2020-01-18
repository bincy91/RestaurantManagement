package com.mycompany.restaurantmanagement.restaurantmanagementmodule;

import java.util.ArrayList;
import java.util.List;

public abstract class Department implements DepartmentInterface{

	
	
	private DEPARTMENTNAME name;
	private String id;
	
	List<Employee> employees = new ArrayList();  
	
	public DEPARTMENTNAME getName() {
		
		return name;
	}

	public String getId() {
		
		return id;
	}

	public void setName(DEPARTMENTNAME name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	

}
