package java021_jdbc.part04;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLPermission;

public class Java220_Jdbc_procedure {
	private Connection conn;
	private CallableStatement cstmt;
	
	public Java220_Jdbc_procedure() {
		
	}
	
	public void process()throws SQLException{
		try {
			//1. 드라이버 로딩	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. DB서버 연결
			String url = "jdbc:mysql://127.0.0.1:3306/mywork";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user,password);
			
			String sql = "{call pro_mem_inmode(?, ?, ?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, "손연재");
			cstmt.setInt(2,  35);
			cstmt.setString(3,  "평창");
			cstmt.execute(); // executeupdate로 써도 된다.
			
			System.out.println("program end");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				cstmt.close();
				conn.close();
			}
	}//end process
	
	public static void main(String[] args) throws SQLException {
		new Java220_Jdbc_procedure().process();
	}//end main
}//end class
