package example2;

import java.sql.SQLException; 
import java.util.List; 
  
  
public interface EmployeeDao { 
	
    int add(Employee emp) throws SQLException; 
    
    int delete(int id) throws SQLException; 
    
    Employee getEmployeeById(int id) throws SQLException;
    
    List<Employee> getAllEmployees() throws SQLException; 
    
    int update(Employee emp) throws SQLException; 
    
}