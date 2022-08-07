import java.sql.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				Connection connection = null;
				try {
					// below two lines are used for connectivity.
					Class.forName("com.mysql.cj.jdbc.Driver");
					connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/mysql",
						"root", "Basketball21!06");

					// mydb is database
					// mydbuser is name of database
					// mydbuser is password of database

					Statement statement;
					statement = connection.createStatement();
					ResultSet resultSet;
					resultSet = statement.executeQuery(
						"select * from books");
					int code;
					String title;
					while (resultSet.next()) {
						code = resultSet.getInt("book_id");
						title = resultSet.getString("bookname");
						System.out.println("Book id : " + code
										+ " Title : " + title);
					}
					resultSet.close();
					statement.close();
					connection.close();
				}
				catch (Exception exception) {
					System.out.println(exception);
				}
			} // function ends
	} // class ends


