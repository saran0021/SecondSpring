package com.rev.spring;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDao {
private JdbcTemplate jdbctemplate;
	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public boolean byPreparedStatement(final Employee obj) {
		String query="insert into employees values(?,?,?)";
		return jdbctemplate.execute(query,new PreparedStatementCallback<Boolean>() {
			 public Boolean doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			              
			        ps.setInt(1,obj.getId());  
			        ps.setString(2,obj.getName());  
			        ps.setInt(3,obj.getSalary());  
			              
			        return ps.execute();  
			              
			    }  
			
			
		});
		
		
	}
	
}
