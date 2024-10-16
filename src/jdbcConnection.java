import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		
		Connection con= DriverManager.getConnection("Jdbc:mysql://" + host + ":" + port + "/QadbIR", "root", "supra@1999IR");
		Statement s= con.createStatement();
		ResultSet rs= s.executeQuery("select * from EmployeeInfo where id=4 ");
		
		while(rs.next()) {
		System.out.println(rs.getString("name"));
		System.out.println(rs.getInt("age"));
	}

}
}