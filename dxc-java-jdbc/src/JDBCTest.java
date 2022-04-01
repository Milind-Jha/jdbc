import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) {
		
		try {

		//Step1: Configure the class with jdbc driver class		
			Class.forName("oracle.jdbc.driver.OracleDriver");
				
		//Step2: Create connection with database
		String databaseURL="jdbc:oracle:thin:@localhost:1521:xe";
		String databaseUsername="system";
		String databasePassword="milind";
		 
			Connection conn = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
		
		 
		 //Step3:Create the statement
		  Statement statement = conn.createStatement();
		  PreparedStatement ps = conn.prepareStatement("Select * from employee");
		 
		 //Step4:Execute the statement and store the result
		  String sql = "Select * from employee";
		  ResultSet rs = statement.executeQuery(sql);
		  ResultSet rs2 = ps.executeQuery();
		  
		  //Step5:Proceed further according to the business logic
		  while(rs.next()) {
			  System.out.println("id : "+rs.getInt(1)+" name: "+rs.getString(2)+" Salary: "+ rs.getDouble(3));
		  }
		  System.out.println("Via prepared Statement ...");
		  while(rs2.next()) {
			  System.out.println("id : "+rs2.getInt(1)+" name: "+rs2.getString(2)+" Salary: "+ rs2.getDouble(3));
		  }
		  //Step6:Close the connection
		  conn.close();
		}
		catch(ClassNotFoundException c) {
			System.out.println("Class not found");
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		  
	}

}
