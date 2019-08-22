package Question7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		int empid;
		String empname;
		int count = 0;
		Employee employee = new Employee();
		
		emp.add(new Employee(1,"Harinath","BRP",15000f));
		emp.add(new Employee(2,"Chandu","CTR",18000f));
		emp.add(new Employee(3,"Manoj","CTT",19000f));
		emp.add(new Employee(4,"Sona","HYD",13000f));
		
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the Employee ID");
	    empid = s.nextInt();
	    System.out.println("Enter the Employe Name");
	    empname = s.next();
	    
	    for (Iterator iterator = emp.iterator(); iterator.hasNext();) {
			Employee empd = (Employee) iterator.next();
			
			if(empd.getId() == empid && empd.getName().equalsIgnoreCase(empname)) {
				count++;
				System.out.println("The employee Details of your search is");
				System.out.println(empd.getId()+":"+empd.getName()+":"+empd.getAddress()+":"+empd.getSal());
			}
		}
	    if(count==0) {
	    	System.out.println("The Employee ID and Name you entered are incorrect.");
	    }
	    
	}


}
