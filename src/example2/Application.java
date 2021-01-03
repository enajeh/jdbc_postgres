package example2;

import java.sql.SQLException;
import java.util.List;

public class Application {

	public static void main(String[] args) throws SQLException {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		
		Employee emp11 = new Employee(1, "homman", "fes");
//		
//		int ok = dao.add(emp11);
//		System.out.println("Creation : "+ ok);
		
//		int removed = dao.delete(3);
//		
//		System.out.println("Suppresion: "+ removed);
		
		
//		List<Employee> employeeList = dao.getAllEmployees();
//		
//		for(int i =0; i<employeeList.size(); i++) {
//			Employee ee = employeeList.get(i);
//			System.out.println("###: " + ee.toString());
//		}
//		
//		
//		
//		for(Employee e: employeeList) {
//			System.out.println("vvv: " + e.toString());
//		}
//		
//		
//		employeeList.forEach(e -> System.out.println("ooo: " + e.toString()));
//		
//		
		int updeted = dao.update(emp11);
		
		System.out.println("Modification: "+ updeted);

	
	}
}
