package JDBC_Demo.JDBC_Proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class JDBC_Fetch {
	
	public static void main(String[] args){
	       
	      try{
	      Connection con = DriverManager.getConnection("jdbc:mysql:///mavemp","root","Password123");
	     
	      Statement st = con.createStatement();

	      String query = "Select * from employee";

	      ResultSet rs= st.executeQuery(query);
	     
	      while(rs.next()){
	        System.out.println(rs.getString(1)+ "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
	     }
	     con.close();
	     }
	     catch(SQLException ex){
	        System.out.println(ex); 
	    }
      
   }
}
