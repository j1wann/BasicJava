package kr.or.ddit.study13_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		//emp_no, emp_name, dept, tel 을 키값으로 
		//100   ,   홍길동   , 영업부, 010-1234-1234 를 value로 넣어보기
		Map<String, Object> map = new HashMap();
		map.put("emp_no", 100);
		map.put("emp_name", "홍길동");
		map.put("dept", "영업부");
		map.put("tel", "010-1234-1234");
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		int emp_no = (int)map.get("emp_no");
		System.out.println(emp_no);
		
		
		
	}
}
