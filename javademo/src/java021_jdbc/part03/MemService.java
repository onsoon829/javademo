package java021_jdbc.part03;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MemService {
	public MemDAO dao;
	
	public MemService() {
		
	}
	
	public int getInsert(MemDTO dto) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false);
			dao = MemDAO.getInstance();
			chk = dao.insertMethod(conn, dto);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
		return chk;
	}
	
	public List<MemDTO>getMemList(){
		List<MemDTO> aList = null;
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false);
			dao = MemDAO.getInstance();
			aList = dao.getListMethod(conn);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
		    JdbcTemplate.close(conn);
		}
		return aList;
	}//end getmenList()
	
	

}//end class

