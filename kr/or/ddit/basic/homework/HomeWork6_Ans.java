package kr.or.ddit.basic.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork6_Ans {
	
	Scanner sc = new Scanner(System.in); 
	
	public static void main(String[] args) {
		HomeWork6_Ans hw = new HomeWork6_Ans();
		hw.process();
	}
	
	public void process() {

		int menu;
		Map<Integer, String> rooms = null;
		
		printStart();
		
		rooms = Load();
		if(rooms == null) {
			rooms = new HashMap<Integer, String>();
		}
		
		while(true) {
			
			printMenu();
			
			System.out.print("메뉴선택 => ");
			menu = sc.nextInt();
			
			
			
			if(menu == 1) {
				checkIn(rooms);
			}
			else if(menu == 2) {
				checkOut(rooms);
			}
			else if(menu == 3) {
				printRoomState(rooms);
			}
			else if(menu == 4) {
				
				Save(rooms);
				
				printEnd();
				break;
			}
			else {
				System.out.println("1~4번중 하나를 입력해주세요.");
			}
			System.out.println();
		}
	}
	
	@SuppressWarnings("unchecked")
	public Map<Integer, String> Load() {
		
		Map<Integer, String> rooms = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream("d:/D_Other/hotelData.txt");
			ois = new ObjectInputStream(fis);
			
			rooms = (Map<Integer, String>) ois.readObject();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return rooms;
	}
	
	public void Save(Map<Integer, String> rooms) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("d:/D_Other/hotelData.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(rooms);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	public void printStart() {
		
		System.out.println("*********************************");
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("*********************************");
		System.out.println();
		System.out.println();
	}
	
	public void printMenu() {
		
		System.out.println("*********************************");
		System.out.println("어떤 업무를 하시겠습니까?");
		System.out.println("1.체크인   2.체크아웃   3.객실상태   4.업무종료");
		System.out.println("*********************************");
		
	}
	
	public void printEnd() {
		
		System.out.println();
		System.out.println("*********************************");
		System.out.println("호텔 문을 닫았습니다.");
		System.out.println("*********************************");
	}
	
	public void checkIn(Map<Integer, String> rooms) {
		
		System.out.println("어느방에 체크인 하시겠습니까?");
		System.out.print("방번호 입력 => ");
		int roomNo = sc.nextInt();
		
		System.out.println("누구를 체크인 하시겠습니까?");
		System.out.print("이름 입력 => ");
		String name = sc.next();
		
		if(rooms.containsKey(roomNo)) {
			System.out.println(roomNo+"번 방에는 이미 사람이 있습니다.");
			return;
		}
		
		rooms.put(roomNo, name);
		System.out.println("체크인 되었습니다.");
	}
	
	public void checkOut(Map<Integer, String> rooms) {
		
		System.out.println("어느방을 체크아웃 하시겠습니까?");
		System.out.print("방번호 입력 => ");
		int roomNo = sc.nextInt();
		
		if(!rooms.containsKey(roomNo)) {
			System.out.println(roomNo+"번 방에는 체크인한 사람이 없습니다.");
			return;
		}
		
		rooms.remove(roomNo);
		System.out.println("체크아웃 되었습니다.");
	}
	
	
	public void printRoomState(Map<Integer, String> rooms) {
		
		Set<Integer> keys = rooms.keySet();
		for(Integer key : keys) {
			System.out.println("방번호 : "+key+", 투숙객 : "+rooms.get(key));
		}
	}
}
