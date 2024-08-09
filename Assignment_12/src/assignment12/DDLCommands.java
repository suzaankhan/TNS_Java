package assignment12;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DDLCommands {

	public static void main(String[] args) throws SQLException {
		
		DatabaseMetaData metaData = null;
		ResultSet result = null;
		boolean columnExists ;
		
		Connection conn = null;
		Statement statement = null;
		String url = "jdbc:mysql://localhost:3307/tns_database";
		String username = "root";
		String password = "root";
		
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Database connected successfully");
			
			// Creating a statement
			statement =  conn.createStatement();
			
			// Creating a table
			String createTable = "CREATE TABLE IF NOT EXISTS Employee(id INT PRIMARY KEY, age INT, name VARCHAR(10))";
			statement.executeUpdate(createTable);
			System.out.println("Table created successfully");
			
			// Altering the table -  Adding a column if it does not exists
			metaData = conn.getMetaData();
			result = metaData.getColumns(null, null, "Employee", "department");
			columnExists = result.next();
			result.close();
			
			if(!columnExists) {
				String alterTable = "ALTER TABLE Employee ADD COLUMN department VARCHAR(15)";
				statement.executeUpdate(alterTable);
				System.out.println("Table Altered: Department column was added");
			}
			else {
				System.out.println("Column already exists");
			}
			
			// Altering the Table - Removing a column
			result = metaData.getColumns(null, null, "Employee", "department");
			columnExists = result.next();
			result.close();
			
			if(columnExists) {
				String col_name = "department";
				String alterDropQuery = "ALTER TABLE Employee DROP COLUMN " + col_name;
				statement.executeUpdate(alterDropQuery);
				System.out.println(col_name+" dropped successfully");
			}
			else {
				System.out.println("No such column exists");
			}
			
			// TRUNCATE - deletes all data in the table
			String truncateQuery = "TRUNCATE TABLE Employee";
			statement.executeUpdate(truncateQuery);
			System.out.println("Table TRUNCATE successfully");
			
			// DROP - Deletes the entire table and also its data
			String dropQuery = "DROP TABLE Employee";
			statement.executeUpdate(dropQuery);
			System.out.println("Table dropped successfully");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			conn.close();
			statement.close();
		}
		
	}
	
}
