package byconstructor;

public class Department {

	private String dname;
	private String location;
	

	

	@Override
	public String toString() {
		return "Department [dname=" + dname + ", location=" + location + "]";
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
	
	
}
