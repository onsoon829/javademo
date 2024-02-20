package java021_jdbc.part04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Java222_Jdbc_procedure {
	private Connection conn;
	private CallableStatement cstmt;
	
	
	public void process()throws SQLException{
		try {
			//1. 드라이버 로딩	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. DB서버 연결
			String url = "jdbc:mysql://127.0.0.1:3306/myxedb";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user,password);
			
			String sql = "{call my_select(?,?,?)}";
			cstmt = conn.prepareCall(sql);
			//입력값
			cstmt.setInt(1, 100);
			
			//반환값
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.execute();
			System.out.printf("%s %d\n", cstmt.getString(2), cstmt.getInt(3));
			
			
						
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
		new Java222_Jdbc_procedure().process();

	}//end main

}
