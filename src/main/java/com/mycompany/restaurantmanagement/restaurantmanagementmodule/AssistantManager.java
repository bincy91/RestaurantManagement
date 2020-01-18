package com.mycompany.restaurantmanagement.restaurantmanagementmodule;

public class AssistantManager extends Employee {

	public AssistantManager(String id, String name, DepartmentInterface dept, DESIGNATION designation) {
		super(id, name, dept, designation);
	}

	public void hire(Employee emp) throws Exception
	{
		if(emp.getDept().getName().equals(getDept().getName()))

          {
	       System.out.println("Hiring :"+emp.getName());
            }
          
          else
        	  throw new Exception("Assistant Manager is authorised to hire employee of his own department only.");

	}
	public void fire(Employee emp) throws Exception
	{
		if(emp.getDept().getName().equals(getDept().getName()))

          {
	       System.out.println("Firing :"+emp.getName());
	       getDept().getEmployees().remove(emp);
            }
          
          else
        	  throw new Exception("Assistant Manager is authorised to fire employee of his own department only.");

	}

}
