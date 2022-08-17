package JDBC_Demo.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		
		try{
		      Connection con = DriverManager.getConnection("jdbc:mysql:///mavemp","root","Password123");
		     
		     Statement st = con.createStatement();

		     String query = "delete from employee where ename='Lucy Thompson'";
         
		     st.executeUpdate(query);
		     
		     System.out.println("The record inserted successfully");
		     
		     con.close();
		     }
		     catch(SQLException ex){
		        System.out.println(ex); 
		    }

	}

}
