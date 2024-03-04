package kr.or.ddit.study07.sec05.db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBservice {
	Connection conn = null;	//접속
	Statement stmt = null;	//쿼리 보냄
	ResultSet rs = null;	//결과
	
	
	public static void main(String[] args) {
		DBservice dbs = new DBservice();
		dbs.selectAll();
	}
	
	
	public void selectAll() {
		try {
			conn = DBConn.getConnection();	//db 접속
			stmt = conn.createStatement();	//쿼리 전송
			String sql = "SELECT MEM_ID, MEM_PASS, MEM_NAME\r\n" + 
					"FROM MEMBER";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String MEMEBER_ID = rs.getString("MEM_ID");
				String MEMBER_PASS = rs.getString("MEM_PASS");
				String MEMBER_NAME = rs.getString("MEM_NAME");
				
				System.out.println(MEMEBER_ID + "\t" + MEMBER_PASS + "\t" + MEMBER_NAME);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
