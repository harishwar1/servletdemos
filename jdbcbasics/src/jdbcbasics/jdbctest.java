package jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbctest {
	public static void main(String[] args) {
		System.out.println("Jdbc test");
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Harishwar@143");
			Statement statement =connection.createStatement();
			int result = statement.executeUpdate("insert into account values(1,'wilson','john',5000)");
			System.out.println("number of rows insrted:"+ result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
