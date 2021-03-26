package lms.Ex;


import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	private Long id;
	private String firstName;
	private String lastName;
	private String emailid;
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	System.out.println(" --- default Const. --");
	}
	
	public Employee(String firstName) {
		System.out.println(" Your firstname is :- "+firstName);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailid=" + emailid
				+ "]";
	}
	
	
	
	
	
	
}
