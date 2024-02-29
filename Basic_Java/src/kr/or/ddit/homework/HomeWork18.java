package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
	}
	public void process() {
		List<Map> list = dataInput();
		//1. 제일 높은 월급 구하기
		int max = maxSalary(list);
		System.out.println("제일 높은 월급 : " + max);
		//2. 각 부서별 월급 총합 구하기
		Map deptSum = getDeptSalsum(list);
		Set<String> set = deptSum.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + deptSum.get(key));
		}
		//3. empno 를 파라미터로 
		//	 모든 정보를 출력하는 메소드 만들기
		printAll(7369);
	}
	
	public void printAll(int empno) {
		//키값이 empno인 맵을 list에서 찾고 하나씩 출력
	}
	
	public Map<String, Integer> getDeptSalsum(List<Map> list){
		Map<String, Integer> deptSum = new HashMap();
		//키값을 비교해서 같으면 list value값을 deptSum value에 더해주기
		//Map에서 dname의 value를 key값으로 주고 sal의 value를 더하기
		//
		deptSum.put((String)list.get(0).get("dname"), (int)list.get(0).get("sal"));
		for(Map m : list) {
			String dname = (String)m.get("dname");
			int sal = (int)m.get("sal");
			deptSum.put(dname, deptSum.get(dname) + sal);
		}
		return deptSum;
	}
	public int maxSalary(List<Map> list) {
		//list 크기 반복하는 for문
		//key값이 sal 인 value 를 비교하며  max값 찾기
		int maxSal = 0;
		for(int i = 0; i < list.size(); i++) {
			if((int)list.get(i).get("sal") > maxSal)
				maxSal = (int)list.get(i).get("sal");
		}
		return maxSal;
	}
	public List<Map> dataInput(){
		List<Map> list = new ArrayList();
//		7369	홍길동	프로그래머	800	조사부
		Map<String, Object> map1 = new HashMap();
		map1.put("emp_no", 7369);
		map1.put("ename", "홍길동");
		map1.put("job", "프로그래머");
		map1.put("sal", 800);
		map1.put("dname", "조사부");
//		7499	고영우	영업사원	1600	영업부
		Map<String, Object> map2 = new HashMap();
		map2.put("emp_no", 7499);
		map2.put("ename", "고영우");
		map2.put("job", "영업사원");
		map2.put("sal", 1600);
		map2.put("dname", "영업부");
//		7521	구기현	영업사원	250	영업부
		Map<String, Object> map3 = new HashMap();
		map3.put("emp_no", 7521);
		map3.put("ename", "구기현");
		map3.put("job", "영업사원");
		map3.put("sal", 250);
		map3.put("dname", "영업부");
//		7566	김동혁	관리자	975	조사부
		Map<String, Object> map4 = new HashMap();
		map4.put("emp_no", 7566);
		map4.put("ename", "김동혁");
		map4.put("job", "관리자");
		map4.put("sal", 975);
		map4.put("dname", "조사부");
//		7654	김민욱	영업사원	1050	영업부
		Map<String, Object> map5 = new HashMap();
		map5.put("emp_no", 7654);
		map5.put("ename", "김민욱");
		map5.put("job", "영업사원");
		map5.put("sal", 1050);
		map5.put("dname", "영업부");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
		return list;
	}
}
