package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class FreeDao {
	private static FreeDao instance = null;

	private FreeDao() {

	}

	public static FreeDao getInstance() {

		if (instance == null) {
			instance = new FreeDao();
		}
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	//전체 리스트
	public List<Map<String, Object>> freeList(){
		String sql = "SELECT NO, TITLE, SUBSTR(CONTENT, 0, 20) CONTENT, WRITER, \r\n" + 
				"TO_CHAR(REGDATE, 'YYYY/MM/DD') REGDATE, COUNT\r\n" + 
				"FROM JAVA_FREEBOARD\r\n" + 
				"WHERE DELYN = 'N'";
		return jdbc.selectList(sql);
	}
	//상세조회
	//업데이트

	public void freeDelete(List<Object> param) {
		// TODO Auto-generated method stub
		String sql = "UPDATE  JAVA_FREEBOARD\r\n" + 
				"SET DELYN = 'Y'\r\n" + 
				"WHERE NO = ?";
		jdbc.update(sql, param);
	}
	
	//삭제
	
	//인서트
	
	
}
