package java021_jdbc.part01;

// JDBC(Java Database Connectivity): 자바 API.
// 다양한 데이터베이스(Mysql, Oracle, SQL등) 시스템에 접근할 수 있다.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public JdbcTest() {
		
	}
	
	public void process() {
		try {
			//1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");// 옆에 referenced libraries에 있는 거
			
			//2. DB서버 연결
			String url = "jdbc:mysql://127.0.0.1:3306/myxedb";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);//주소,유저,패스워드
		    System.out.println(conn);
		    
		    //3. 쿼리문을 실행하기 위한 Statement객체를 생성
		    stmt = conn.createStatement();
		    
		    //4. 쿼리문을 실행: SELECT - executeQuery(), 리턴타입
		    //update, insert, delete - executeUpdate() 리턴타입
		    // ResultSet executeQuery(), int exexuteUpdate()
		    String sql = "SELECT * FROM department_id, department_name, manager_id, location_id ORDER BY department_id";
		    rs = stmt.executeQuery(sql);
		    while(rs.next()) {
		    	int departmentId = rs.getInt("department_id");
		    	String departName = rs.getString("department_name");
		    	int managerId = rs.getInt("manager_id");
		    	int locationId = rs.getInt("location_id");
		    	System.out.printf("%d %s %d %d\n", departmentId, departName, managerId, locationId);
		    }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // 반드시 꺼야 함. 열었던 순서 역순으로.
			if(rs!=null)
				try {
					rs.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			if(stmt!=null)
				try {
					stmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
		    if(conn != null)
		    	try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}//end process

}//end class
