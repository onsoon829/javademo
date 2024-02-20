package java021_jdbc.part04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLException; 
public class Java219_Jdbc_procedure {
	private Connection conn;
	private CallableStatement cstmt;
	
	public Java219_Jdbc_procedure() {
		
	}
	
	public void process() throws SQLException{
		try {
		//1. 드라이버 로딩	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. DB서버 연결
		String url = "jdbc:mysql://127.0.0.1:3306/mywork";
		String user = "root";
		String password = "1234";
		conn = DriverManager.getConnection(url, user,password);
		
		String sql = "{call pro_pltest(?)}";
		cstmt = conn.prepareCall(sql); // 생성
		cstmt.setString(1,  "message");// 생성
		cstmt.execute();               // 생성
		System.out.println("program end");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			cstmt.close();
			conn.close();
		}
	}

	public static void main(String[] args) throws SQLException{
		new Java219_Jdbc_procedure().process();
		
	}//end main

}//end class
