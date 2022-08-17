package JDBC_Demo.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {

	public static void main(String[] args) {
		
		try{
		      Connection con = DriverManager.getConnection("jdbc:mysql:///mavemp","root","Password123");
		     
		     Statement st = con.createStatement();

		     String query = "INSERT INTO employee(eno,ename,address,age,email) values (103,'Lucy Thompson','USA','24','lucyT@hexaware.com')";
             
		     st.executeUpdate(query);
		     
		     System.out.println("The record inserted successfully");
		     
		     con.close();
		     }
		     catch(SQLException ex){
		        System.out.println(ex); 
		    }

	}

}
