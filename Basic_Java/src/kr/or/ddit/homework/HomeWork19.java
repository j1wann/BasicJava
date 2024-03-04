package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork19 {
	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		hw.process();
	}

	public void process() {
		Scanner sc = new Scanner(System.in);
		List<Map> list = dataInput();
		// 전체 출력하기
		printAll(list);

		// 차량번호를 입력하면 시간 계산
		System.out.print("차량번호를 입력하세요 : ");
		String carNum = sc.next(); 
		int pay = pay(getMin(list, carNum));
		System.out.println("차량 번호 : " + carNum + "\n이용시간 : "+ getMin(list, carNum) + " 지불할 금액 : " + pay);
	}

	public int pay(int min) {
//		기본시간 (분)	기본요금(원)	단위시간(분)	단위요금(원)
//		180			5000		10			600
		if(min <= 180)
			return 5000;
		else
			return 5000 + (min - 180)/10*600;
	}

	public int getMin(List<Map> list, String carNum) {
		int Min = 0;
		List<String> minList = new ArrayList();
		for (Map map : list) {
			if (carNum.equals(map.get("차량번호")))
				minList.add((String) map.get("시각"));
		}
		for (int i = 0; i < minList.size(); i += 2) {
			Min += getTime(minList.get(i + 1)) - getTime(minList.get(i));
		}
		return Min;
	}

	public int getTime(String time) {
		String hours = time.split(":")[0];
		String mins = time.split(":")[1];
		return Integer.parseInt(hours) * 60 + Integer.parseInt(mins);
	}

	public void printAll(List<Map> list) {
		int cnt = 1;
		for (Map map : list) {
			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			System.out.println("내역 " + cnt);
			while (it.hasNext()) {
				String key = it.next();
				System.out.println(key + " : " + map.get(key));
			}
			System.out.println("===============");
			cnt++;
		}
	}

	public List<Map> dataInput() {
//	시각		차량번호		내역

//	05:34	5961		입차
//	06:00	0000		입차
//	06:34	0000		출차
//	07:59	5961		출차
//	07:59	0148		입차
//	18:59	0000		입차
//	19:09	0148		출차
//	22:59	5961		입차
//	23:00	5961		출차
//	23:59	0000		출차

		List<Map> list = new ArrayList();
		Map<String, String> map1 = new HashMap();
		map1.put("시각", "05:34");
		map1.put("차량번호", "5961");
		map1.put("구분", "입차");
		Map<String, String> map2 = new HashMap();
		map2.put("시각", "06:00");
		map2.put("차량번호", "0000");
		map2.put("구분", "입차");
		Map<String, String> map3 = new HashMap();
		map3.put("시각", "06:34");
		map3.put("차량번호", "0000");
		map3.put("구분", "출차");
		Map<String, String> map4 = new HashMap();
		map4.put("시각", "07:59");
		map4.put("차량번호", "5961");
		map4.put("구분", "출차");
		Map<String, String> map5 = new HashMap();
		map5.put("시각", "07:59");
		map5.put("차량번호", "0148");
		map5.put("구분", "입차");
		Map<String, String> map6 = new HashMap();
		map6.put("시각", "18:59");
		map6.put("차량번호", "0000");
		map6.put("구분", "입차");
		Map<String, String> map7 = new HashMap();
		map7.put("시각", "19:09");
		map7.put("차량번호", "0148");
		map7.put("구분", "출차");
		Map<String, String> map8 = new HashMap();
		map8.put("시각", "22:59");
		map8.put("차량번호", "5961");
		map8.put("구분", "입차");
		Map<String, String> map9 = new HashMap();
		map9.put("시각", "23:00");
		map9.put("차량번호", "5961");
		map9.put("구분", "출차");
		Map<String, String> map10 = new HashMap();
		map10.put("시각", "23:59");
		map10.put("차량번호", "0000");
		map10.put("구분", "출차");

		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);

		return list;
	}
}
