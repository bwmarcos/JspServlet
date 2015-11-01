package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	private static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER="SYSTEM";
	private static final String PASSWORD="123";
	
	protected Connection con;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	protected void open()throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(URL,USER,PASSWORD);
		
		
	}
	protected void close() throws Exception{
		con.close();
	}
	

}
