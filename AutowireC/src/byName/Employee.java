package byName;

import java.util.Map;

public class Employee {

	private Department depname;
	private Address add;
	
	
	
	
	@Override
	public String toString() {
		return "Employee [depname=" + depname + ", add=" + add + "]";
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
