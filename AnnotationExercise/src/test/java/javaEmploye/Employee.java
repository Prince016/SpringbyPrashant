package javaEmploye;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Address add;
    private String name;
    
    public Employee(Address add) {
		// TODO Auto-generated constructor stub
	 this.add=add;
	 System.out.println(" constructor of employee");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println(" Setter method of employee");
	}
	
    
    
    
    
	
//	public Address getAdd() {
//		return add;
//	}
//
//	public void setAdd(Address add) {
//		this.add = add;
//	}
	
	
	
	
}
