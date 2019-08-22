package Question7;

public class Employee {
   
	int id;
	String name;
	String address;
	float sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	public Employee() {
	}
	public Employee(int id,String name,String address,float sal){
		this.address = address;
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
}
