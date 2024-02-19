package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class DepartmentsDAO {
	private DepartmentsDAO() {
		
	}
	private static DepartmentsDAO dao = new DepartmentsDAO();
	
	public static DepartmentsDAO getInstance() {
		return dao;
	}
	
	public List<DepartmentsDTO> getListMethod(Connection conn, String search){
		
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//		   stmt = conn.createStatement();
//		   String sql = "SELECT*FROM departments WHERE upper(department_name) KIKE upper('%" + search + "%') ORDER BY department_id";
//		   rs = stmt.executeQuery(sql);
			
			String sql = "SELECT*FROM departments WHERE upper(department_name) KIKE upper(?) ORDER BY department_id";
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1,  "%" + search + "%");
		    rs = pstmt.executeQuery();
		    
		    
		    
			while(rs.next()) {
			   DepartmentsDTO dto = new DepartmentsDTO();
			   dto.setDepartment_id(rs.getInt("department_id"));
			   dto.setDepartment_name(rs.getString("department_name"));
			   dto.setManager_id(rs.getInt("manager_id"));
			   dto.setLocation_id(rs.getInt("location_id"));
			   aList.add(dto);
		   }
		} catch (Exception e) {
			e.printStackTrace(); 
		}finally{
			JdbcTemplate.close(rs);
			JdbcTemplate.close(stmt);
		}// 자원 반납..?		
		return aList;
	}//end getListmethod
	
	

}//end class
