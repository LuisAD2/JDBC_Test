package JDBC_Demo.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Update {

	public static void main(String[] args) {
		
		try{
		      Connection con = DriverManager.getConnection("jdbc:mysql:///mavemp","root","Password123");
		     
		     Statement st = con.createStatement();

		     String query = "Update employee set ename= 'Marcos A', age = 25 where ename='Luis Alvarado'";
           
		     st.executeUpdate(query);
		     
		     System.out.println("The record inserted successfully");
		     
		     con.close();
		     }
		     catch(SQLException ex){
		        System.out.println(ex); 
		    }

	}

}
