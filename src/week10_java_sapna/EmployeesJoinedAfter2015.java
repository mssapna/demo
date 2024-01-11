package week10_java_sapna;

import java.util.ArrayList;
import java.util.List;

public class EmployeesJoinedAfter2015 {
	
	public static void main(String[] args) {
		EmployeesJoin join=new EmployeesJoin();
		join.employeesJoinedAfter2015();
	}
}

class EmployeesJoin
{
	void employeesJoinedAfter2015()
	{
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "Ram", 32, "Male", "HR", 2011, 25000.0));
		employeeList.add(new Employee(2, "Sita", 25, "Female", "Marketing", 2015, 13500.0));
		employeeList.add(new Employee(3, "Murali", 29, "Male", "Sales", 2012, 18000.0));
		employeeList.add(new Employee(4, "Mahesh", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new Employee(5, "Preethi", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(6, "Gopi", 43, "Male", "Accounts", 2016, 10500.0));
		employeeList.add(new Employee(7, "Kamal", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new Employee(9, "AKhila", 24, "Female", "Marketing", 2016, 11500.0));
		employeeList.add(new Employee(10, "Arjun", 38, "Male", "Sales", 2015, 11000.5));
	//Get the names of all employees who have joined after 2015?
		
	employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
	}

}
