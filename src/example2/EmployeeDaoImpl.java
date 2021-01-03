package example2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

	static Connection connexion = DBConnection.getConnection();

	@Override
	public int add(Employee emp) throws SQLException {

		String requete = "insert into employee(emp_name, emp_address) VALUES (?, ?)";
		
		PreparedStatement ps = connexion.prepareStatement(requete);
		
		ps.setString(1, emp.getEmp_name());
		ps.setString(2, emp.getEmp_address());
		
		int n = ps.executeUpdate();
		return n;
	}

	@Override
	public int delete(int id) throws SQLException {
		String requete = "delete from employee where emp_id =?";
		
		PreparedStatement ps = connexion.prepareStatement(requete);
		ps.setInt(1, id);
		
		return ps.executeUpdate();
	}

	@Override
	public Employee getEmployeeById(int id) throws SQLException {

		String query = "select * from employee where emp_id= ?";
		PreparedStatement ps = connexion.prepareStatement(query);

		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		Employee emp = null;
		while (rs.next()) {
			emp = new Employee();
			
			
			emp.setEmp_id(rs.getInt("emp_id"));
			emp.setEmp_name(rs.getString("emp_name"));
			emp.setEmp_address(rs.getString("emp_address"));
		}

		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		String query = "select * from employee";
		
		PreparedStatement ps = connexion.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		List<Employee> list = new ArrayList<>();

		while (rs.next()) {
			Employee emp = new Employee();
			
			emp.setEmp_id(rs.getInt("emp_id"));
			emp.setEmp_name(rs.getString("emp_name"));
			emp.setEmp_address(rs.getString("emp_address"));
			
			list.add(emp);
		}
		return list;
	}

	@Override
	public int update(Employee emp) throws SQLException {

		String query = "update employee set emp_name=?, " + " emp_address= ? where emp_id = ?";
		PreparedStatement ps = connexion.prepareStatement(query);
		ps.setString(1, emp.getEmp_name());
		ps.setString(2, emp.getEmp_address());
		ps.setInt(3, emp.getEmp_id());
		
		return ps.executeUpdate();
	}
}