package com.accolite.ims.ims.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.accolite.ims.ims.dao.EmployeeDao;
import com.accolite.ims.ims.modles.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{
	 @Autowired
	  private JdbcTemplate jdbctemplate;

	@Override
	public List<Employee> findEMployee() {
		String query="select * from employee";
		return  jdbctemplate.query(query,(resultSet,rowNum)->{
			Employee emp=new Employee();
			emp.setEmployeeId(resultSet.getLong("employeeId"));
			emp.setUsername(resultSet.getString("username"));
			return  emp;
		});
				
		
	}

	@Override
	public Employee findEmployeeById(String emplID) {
		String query="select * from employee where username=\""+emplID+"\"";
		return  (Employee) jdbctemplate.query(query,(resultSet)->{
			while(resultSet.next()) {
			Employee emp=new Employee();
			emp.setEmployeeId(resultSet.getLong("employeeId"));
			emp.setUsername(resultSet.getString("username"));
			emp.setEmployeename(resultSet.getString("employeename"));
			emp.setRole(resultSet.getString("role"));
			return  emp;
			}
			return null;
		});
	}

}
