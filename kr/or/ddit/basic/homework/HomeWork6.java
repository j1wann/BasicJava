package kr.or.ddit.basic.homework;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork6 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		System.out.println("***************");
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("***************");
		new HomeWork6().start();
	}

	private void start() throws IOException {
		
		Map<Integer, String> data = fileCheck();
		
		while (true) {

			System.out.println("어떤 업무를 하시겠습니까?");
			System.out.println("1.체크인\t2.체크아웃\t3.객실상태\t4.업무종료");
			System.out.print("메뉴 선택 => ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				checkIn(data);
				break;
			case 2:
				checkOut(data);
				break;
			case 3:
				roomCheck(data);
				break;
			case 4:
				close(data);
				return;
			default:
				break;
			}
		}
	}

	private void close(Map<Integer, String> data) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("d:/D_Other/hotelManage.bin"));
		oos.writeObject(data);
		oos.close();
	}

	@SuppressWarnings("unchecked")
	private Map<Integer, String> fileCheck() {
		Map<Integer, String> data = new HashMap<Integer, String>();
		try {
			
			@SuppressWarnings("resource")
			ObjectInputStream ois = 
					new ObjectInputStream(new FileInputStream("d:/D_Other/hotelManage.bin")); 
			data = (Map<Integer, String>) ois.readObject();
		} catch (Exception e) {
			System.out.println("기존 파일 X");
		}
		
		return data;
	}

	private void roomCheck(Map<Integer, String> data) {
		
		Set<Integer> key = data.keySet();
		Iterator<Integer> it = key.iterator();
		
		while(it.hasNext()) {
			int roomNum = it.next();
			System.out.print("방번호 : " + roomNum);
			System.out.print("\t투숙객 : " + data.get(roomNum));
			System.out.println();
		}
		return;
	}

	private void checkOut(Map<Integer, String> data) {
		System.out.println("어느 방을 체크아웃 하시겠습니까?");
		System.out.print("방번호 입력 : ");
		int roomNum = sc.nextInt();
		
		data.remove(roomNum);
		
		return;
	}

	private void checkIn(Map<Integer, String> data){
		System.out.println("어느방에 체크인 하시겠습니까?");
		System.out.print("방번호 입력 : ");
		int roomNum = sc.nextInt();
		
		if(data.containsKey(roomNum)) {
			System.out.println(roomNum + "방에는 이미 사람이 있습니다.");
			return;
		}
		
		System.out.print("누구를 체크인 하시겠습니까? : ");
		String name = sc.next();
		
		data.put(roomNum, name);
		return;
	}

}