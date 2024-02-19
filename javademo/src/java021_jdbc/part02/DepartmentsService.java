package java021_jdbc.part02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentsService {
	DepartmentsDAO dao = null;

	public DepartmentsService() {

	}

	public List<DepartmentsDTO> getDepartmentsList() {
		List<DepartmentsDTO> aList = null;

		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false);// 커밋 전까진 자동 진행. 자동 커밋 해제
			dao = DepartmentsDAO.getInstance();
			//aList = dao.getListMethod(conn);
			JdbcTemplate.commit(conn);
		} catch (SQLException ex) {
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}
		return aList;

	}// end getdepartmentslist()

	public List<DepartmentsDTO> getSearchMethod(String search) {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
		Statement stmt = null;
		ResultSet rs = null;

		Connection conn = JdbcTemplate.getConnection();
		try {
			conn.setAutoCommit(false);// 커밋 전까진 자동 진행. 자동 커밋 해제
			dao = DepartmentsDAO.getInstance();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM departments WHERE department_name LIKE '%" + search
					+ "%' ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(stmt);
		}
		return aList;
	}

}
// end class
