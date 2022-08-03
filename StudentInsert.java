import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import ExceptionHandlingJDBC.StudentAlreadyExists;

class StudentInsert{
	public static void main(String[] args) {
	          // TODO Auto-generated method stub
	          try {
	        	System.out.println("Registering driver...");    
	  			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
	  			System.out.println("Driver registered....");
	  			
	  			System.out.println("Trying to connect to the DB");
	  			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
	  			System.out.println("Connected to the DB : "+conn);
	  			
	  			System.out.println("trying to make a Prepared statment");
				PreparedStatement pstmt = conn.prepareStatement("INSERT INTO STUDENTDB VALUES (?,?,?,?,?,?,?,?);");
				System.out.println("Prepared Statement created : "+pstmt);
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter Roll no : ");
	            int rno = sc.nextInt();
	              
	            System.out.println("Enter Student Name :");
	            String sname = sc.next();
	              
	            System.out.println("Enter Date of birth of the Student");
	            String dob = sc.next();
				Date date = Date.valueOf(dob);

	              
	            System.out.println("Enter Physics Marks");
	            int phy = sc.nextInt();
	              
	            System.out.println("Enter Chemistry Marks");
	            int chem = sc.nextInt();
	              
	            System.out.println("Enter Maths Marks");
	            int maths = sc.nextInt();
	              
	            int total = chem+maths+phy;
	              
	            String grade;
	            float avg = total/3;
	            if(avg> 90)
	            {
	            	grade = "A+";
	            }else if (avg <90 && avg >80) {
	            	grade ="A";
	            }else if (avg <80 && avg >70) {
	            	grade ="B";
	            }else if (avg <70 && avg >60) {
	            	grade ="C";
	            }else if (avg <60 && avg >50) {
	            	grade ="D";
	            }else if (avg <50 && avg >40) {
	            	grade ="E";
	            }else {
	            	grade ="F";
	            } 
	        
	            pstmt.setInt(1,rno);
	            pstmt.setString(2,sname);
	            pstmt.setString(3,dob);
	            pstmt.setInt(4,phy);
	            pstmt.setInt(5,chem);
	            pstmt.setInt(6,maths);
	            pstmt.setInt(7,total);
	            pstmt.setString(8,grade);
	                
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from studentdb where rollno ="+rno);
	            if(rs.next())
	            {
	                 StudentAlreadyExists stAlready = new StudentAlreadyExists("Student Already Exists");
	                 throw stAlready;
	            }else {
	                   pstmt.executeUpdate();
	                   ResultSet rs1 = stmt.executeQuery("select * from studentdb");
	                   System.out.println("-----------List of all Students after Insertion---------------");
	                   while(rs1.next())
	                   { 
	                        System.out.println("Roll no 	    : "+rs1.getInt(1));
	                        System.out.println("Student Name 	: "+rs1.getString(2));
	                        System.out.println("Date of Birth 	: "+rs1.getString(3));
	                        System.out.println("Physics Marks 	: "+rs1.getInt(4));
	                        System.out.println("Chemistry Marks	: "+rs1.getInt(5));
	                        System.out.println("Maths Marks     : "+rs1.getInt(6));
	                        System.out.println("Total Marks 	: "+rs1.getInt(7));
	                        System.out.println("Grade 			: "+rs1.getString(8));
	                        System.out.println("--------------------------");
	                        System.out.println("Trying to execute the prepared statement....");
	                      
	                   }

	              	}
	          }catch (SQLException e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();}
	          catch (StudentAlreadyExists e) {
				// TODO: handle exception
	        	  e.printStackTrace();
			}
	}
}
	          
	
