import static org.junit.Assert.*;



import org.junit.Test;

import com.ies.poo.proctux.employee.Assistant;
import com.ies.poo.proctux.employee.Employee;
import com.ies.poo.proctux.employee.EmployeesList;
import com.ies.poo.proctux.employee.Manager;
import com.ies.poo.proctux.employee.Seller;

public class AbstractClassesTest {
	@Test
	public void baseSalaryToTheEmployee() throws Exception {
		Employee luiz = new Manager("Luiz", "AB-1202", 5000.00);
		Employee fulano = new Assistant("Fulano", "AC-0109", 1500.00);
		Employee cicrano = new Seller("Cicrano", "AE-1212", 1500.00, 4000.00);
		
		EmployeesList employeesList = new EmployeesList();
		employeesList.addEmployee(luiz);
		employeesList.addEmployee(fulano);
		employeesList.addEmployee(cicrano);
		
		assertEquals(Double.valueOf(17000), employeesList.employeesTotalSalary());
	}
}
