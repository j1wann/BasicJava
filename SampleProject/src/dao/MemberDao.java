package dao;
import util.JDBCUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class MemberDao {
	private static MemberDao instance = null;

	private MemberDao() {

	}

	public static MemberDao getInstance() {

		if (instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> memberList(List param){
		String sql = "SELECT * FROM MEMBER WHERE MEM_LIKE = ?";
		
		
		return jdbc.selectList(sql, param);
	}
	public Map<String, Object> login(List<Object> param) {
		String sql = "select *\r\n" + 
				"from member\r\n" + 
				"where mem_id = ?\r\n" + 
				"and mem_pass = ?";
		return jdbc.selectOne(sql, param);
	}
}
