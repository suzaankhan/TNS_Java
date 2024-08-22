package assignment12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDoperations {

	public static void main(String[] args) throws SQLException  {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		Statement statement = null;
		
		String url = "jdbc:mysql://localhost:3307/tns_database";
		String password = "root";
		String username = "root";
		
		try{
			// connecting to the database
			conn = DriverManager.getConnection(url, username, password);
			statement = conn.createStatement();
			
			// creating a table - C
			String createTable = "CREATE TABLE IF NOT EXISTS Employee "
					+ "(id int primary key, name varchar(15), department varchar(10),salary int)";
			statement.executeUpdate(createTable);
			System.out.println("Table created successfully");
			
			// Inserting in the table
			String insertQuery = "INSERT INTO Employee (id, name, department, salary)"
					+ " VALUES (?,?,?,?)";
			pstm = conn.prepareStatement(insertQuery);
			pstm.setInt(1, 2);
			pstm.setString(2, "Samay");
			pstm.setString(3, "HR");
			pstm.setInt(4, 25000);
			pstm.execute();
			System.out.println("Data inserted in the table");
			
			pstm.setInt(1, 3);
			pstm.setString(2, "Ajay");
			pstm.setString(3, "Intern");
			pstm.setInt(4, 15000);
			pstm.execute();
			System.out.println("Data inserted in the table"); 
			
			// UPDATE QUERY
			String updateQuery = "UPDATE Employee SET name=?, department=?, salary=? WHERE id=?";
			pstm = conn.prepareStatement(updateQuery);
			pstm.setString(1, "Mohan");
			pstm.setString(2, "Accounts");
			pstm.setInt(3, 30000);
			pstm.setInt(4, 2);
			pstm.execute();
			System.out.println("UPDATE Query executed successfully");
			
			// DELETE QUERY
			String deleteQuery = "DELETE FROM Employee WHERE id=?";
			pstm = conn.prepareStatement(deleteQuery);
			pstm.setInt(1, 1);
			pstm.execute();
			System.out.println("Record deleted success");
			
			// SELECT Query and printing the records
			String selectQuery = "SELECT * FROM Employee";
			pstm = conn.prepareStatement(selectQuery);
			result = pstm.executeQuery();
			
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String department = result.getString("department");
				int salary = result.getInt("salary");
				
				System.out.println("id: " + id
						+ " name: " + name
						+ " department: " + department
						+ " salary: " + salary);
			}
			
			System.out.println("");
			// SELECTING ON CONDITION
			String conditionSelect = "SELECT * FROM Employee WHERE id=?";
			pstm = conn.prepareStatement(conditionSelect);
			pstm.setInt(1, 3);
			result = pstm.executeQuery();
			
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String department = result.getString("department");
				int salary =  result.getInt("salary");
				
				System.out.println("id: " + id
						+ " name: " + name
						+ " department: " + department
						+ " salary: " + salary);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			conn.close();
			result.close();
			pstm.close();
			statement.close();
		}
		
	}
	
}
