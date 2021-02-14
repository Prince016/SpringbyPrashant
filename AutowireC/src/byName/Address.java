package byName;

import javax.management.loading.PrivateClassLoader;

import org.springframework.remoting.rmi.CodebaseAwareObjectInputStream;

public class Address {

	
private String state;
private String city;
private String house_no;


@Override
public String toString() {
	return "Address [state=" + state + ", city=" + city + ", house_no=" + house_no + "]";
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getHouse_no() {
	return house_no;
}


public void setHouse_no(String house_no) {
	this.house_no = house_no;
}












}
	
	


	

