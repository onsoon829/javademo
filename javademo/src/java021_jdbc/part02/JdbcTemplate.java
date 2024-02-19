package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {

	public static Connection getConnection() {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/myxedb";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}// end getconnection
	
	//ResultSet 객체 닫기
	public static void close(ResultSet rs) {
		if(rs!=null)
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
	

	// Statement 또는 PreparedStatement 객체 닫기
	public static void close(Statement stmt) {
		if(stmt!=null)
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}

	//connection 객체 닫기
	public static void close(Connection conn) {
		if(conn!=null)
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//commit
	
	public static boolean isConnection(Connection conn) throws SQLException{
		boolean valid = true;
		if(conn ==null || conn.isClosed())
			valid = false;
		return valid;
	}
	
	//commit
	public static void commit(Connection conn) {
		try {
			if(isConnection(conn))
				conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	//rollback
	public static void rollback(Connection conn) {
		try {
			if(isConnection (conn))
				conn.rollback();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
}// end class
