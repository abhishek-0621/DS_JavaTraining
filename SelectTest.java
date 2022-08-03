import java.sql.Statement;
import java.util.Scanner;
import ExceptionHandlingJDBC.EmployeeNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
		try {
			System.out.println("Registering Driver...");
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered...");
			
			System.out.println("Trying to connect to teh Database...");
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
			System.out.println("Connected to the Database : "+connection);
			
			System.out.println("Trying to make a statement");
			Statement statement= connection.createStatement();
			System.out.println("Statement created");
			
			System.out.println("Trying to execute statement");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter emp no..");
			int eno = sc.nextInt();
			ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE where EMPNO="+eno);
		//	ResultSet rs=statement.executeQuery("SELECT * FROM EMPLOYEE");
			
			
			System.out.println("Statement Executed, got the result ");
			if(rs.next()) {
				int empno= rs.getInt(1);
				String ename=rs.getString(2);
				int sal=rs.getInt(3);
				System.out.println("EMP NO    : "+empno);
				System.out.println("EMP NAME  : "+ename);
				System.out.println("EMP SAL   : "+sal);
				System.out.println("---------------");
			}
			else {
				EmployeeNotFoundException empNotFndEx = new EmployeeNotFoundException("Employee ID does not exist");
				throw empNotFndEx;
			}
			statement.close();	connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
