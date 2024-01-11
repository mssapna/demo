package week10_java_sapna;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfMaleAndFemaleInSalesAndMarkting {
	public static void main(String[] args) {
	EmployeeListClass emp=new EmployeeListClass();
	List<Employee> Emp=emp.employeeList();
	Map<String, Map<String, Long>> genderCountByDepartment = Emp.stream().filter(e -> e.getDepartment().equals("Sales") || e.getDepartment().equals("Marketing"))
            .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.groupingBy(Employee::getGender, Collectors.counting())
            ));
}
}
