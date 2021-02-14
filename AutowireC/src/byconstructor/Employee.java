package byconstructor;

import java.util.Map;

public class Employee {

	private String empname;
	private Department depname;
	private Address add;
	
	
	
	


	
	
	public Employee(String empname, Department depname, Address add) {
		
		this.empname = empname;
		this.depname = depname;
		this.add = add;
		System.out.println("from the constructor");
	}
	
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", depname=" + depname + ", add=" + add + "]";
	}
	public Department getDepname() {
		return depname;
	}
	public void setDepname(Department depname) {
		this.depname = depname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}


	
	
	
	

	
	
	
	
}
