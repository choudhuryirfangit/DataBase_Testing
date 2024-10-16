import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.cj.protocol.Resultset;

public class SF_Login_By_Database {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		String username=null;
		String password=null;
		
		Connection con= DriverManager.getConnection("Jdbc:mysql://" + host + ":" + port + "/QadbIR", "root", "supra@1999IR");
		Statement s= con.createStatement();
		ResultSet rs= s.executeQuery("select * from EmployeeInfo where id=6 ");
		
		while(rs.next()) {
		username=rs.getString("name");
		password=rs.getString("location");
		System.out.println(username);
		System.out.println(password);
		
	}
		WebDriver driver=new FirefoxDriver();
		driver.get("https://choudhuryindustries-dev-ed.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		
}
}