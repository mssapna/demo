package week10_java_sapna;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesOfEmployeeInEachDepartment {
public static void main(String[] args) {
	//5. List down the names of all employees in each department?
	
	EmployeeListClass emp=new EmployeeListClass();
	List<Employee> Emp=emp.employeeList();
	
    Map<String, List<String>> employeesByDepartment = Emp.stream()
            .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.mapping(Employee::getName, Collectors.toList())
            ));
    System.out.println(employeesByDepartment);

}


}
