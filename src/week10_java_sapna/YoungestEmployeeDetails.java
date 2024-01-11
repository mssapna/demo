package week10_java_sapna;


import java.util.List;
import java.util.Optional;


public class YoungestEmployeeDetails {
public static void main(String[] args) {
	YoungestAmongEmployee employee=new YoungestAmongEmployee();
	employee.fetchYoungestEmployeeDetails();
}
}


class YoungestAmongEmployee{
	void fetchYoungestEmployeeDetails()
	{
		EmployeeListClass emp=new EmployeeListClass();
		List<Employee> Emp=emp.employeeList();
		//Get the youngest employee details each department wise (By Using Optional)?
		
	

	     Optional<Employee> youngestInDevelopment = Emp.stream()
	             .min((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
	     System.out.println(youngestInDevelopment);
	    
	

	}
}