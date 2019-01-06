package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class BasiceDao {
	private final String URL="jdbc:mysql://localhost:3306/test?"
			+ "useUnicode=true&characterEncoding=utf8&autorReconnect="
			+ "true&failOverReadOnly=false";
	private final String USER="root";
	private final String PASSWORD="root";
	private final String DRIVER="com.mysql.jdbc.Driver";
	private Connection con;
	public Connection getConnection() throws SQLException{
				try {
					Class.forName(DRIVER);
					con=DriverManager.getConnection(URL, USER, PASSWORD);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return con;	
	}
}
