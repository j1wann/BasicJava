package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import vo.FreeVo;

public class FreeDao {
	private static FreeDao instance = null;
	
	private FreeDao() {
		
	}
	
	public static FreeDao getInstance() {
		if(instance == null) {
			return instance = new FreeDao();
		}
		else
			return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> getList(){
		String sql = "SELECT *\r\n" + 
				"FROM FREEBOARD";
		
		return jdbc.selectList(sql);
	}
	public List<FreeVo> freeList(List<Object> param) {
		String sql = "SELECT A.* FROM (SELECT ROWNUM RN, F.*\r\n" + 
				"                            FROM FREEBOARD F\r\n" + 
				"                            WHERE DELYN = 'N') A\r\n" + 
				"WHERE RN <= ? AND RN >=?";
		return jdbc.selectList(sql, param, FreeVo.class);
	}
	
}
