package com.mycompany.restaurantmanagement.restaurantmanagementmodule;

public class Manager extends Employee{

	public Manager(String id, String name, DepartmentInterface dept, DESIGNATION designation) {
		super(id, name, dept, designation);
		
	}
	
	public void hire(Employee emp)
	{
		
		System.out.println("Hiring :"+emp.getName());
	}
	
	public void fire(Employee emp)
	{
		
		System.out.println("Firing :"+emp.getName());
	}

}
