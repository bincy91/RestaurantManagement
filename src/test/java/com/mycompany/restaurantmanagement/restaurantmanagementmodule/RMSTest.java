package com.mycompany.restaurantmanagement.restaurantmanagementmodule;

public class RMSTest {

	public static void main(String[] args) throws Exception {

		Department kitchenDept = new Kitchen();
		kitchenDept.setId("1");
		kitchenDept.setName(DEPARTMENTNAME.KITCHEN);
		AssistantManager assistMgr = new AssistantManager("1", "Bincy", kitchenDept, DESIGNATION.ASSISTANT_MANAGER);
		Manager mgr = new Manager("2", "Jacky", kitchenDept, DESIGNATION.MANAGER);
		mgr.hire(mgr);
		kitchenDept.addEmployee(assistMgr);
		kitchenDept.addEmployee(mgr);

		Department barDept = new Bar();
		barDept.setId("2");
		barDept.setName(DEPARTMENTNAME.BAR);
		Employee barTender = new Employee("3","Pinto", barDept,DESIGNATION.BARTENDER);
		Employee chef = new Employee("4","Rini", kitchenDept,DESIGNATION.CHEF);
		mgr.hire(barTender);
		assistMgr.hire(chef);
		assistMgr.fire(barTender);
	}

}
