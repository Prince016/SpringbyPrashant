package lms.Ex;


import java.util.HashMap;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.parsing.EmptyReaderEventListener;

public class EmployeeService {
	private Employee emp;

	HashMap<Integer,Employee> empMap = new HashMap<>();

	
	public void add(Integer key,Employee employee) {
		
		empMap.put(key, employee);
		System.out.println(" -- Successfull -- ");
		
	}
	
   public void update() {
 
	   System.out.println(" Enter the key to update your employee");
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("firstName :- ");
	   String firstName=sc.next();
	   
	   System.out.println("Last name :- ");
	   String lastName=sc.next();
	   System.out.println("email id :- ");
	   String emailid=sc.next();
	   
	   System.out.println("id :-> ");
	   long id = sc.nextInt();

	   
	   emp.setFirstName(firstName);
	   
	   emp.setLastName(lastName);
	   emp.setEmailid(emailid);
	   emp.setId(id);
	   
		System.out.println("--- Updated ---");
  }

public void delete(Integer key) {
	
	
	empMap.remove(key);
	System.out.println(empMap.get(key)+"has been removed ---");
	
	
}
	
	
	
}
