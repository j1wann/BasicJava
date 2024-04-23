package kr.or.ddit.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 객체 입출력을 위한 보조 스트림 예제
 * @author PC-14
 *
 */

public class T15ObjectStreamTest {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Member mem1 = new Member("김용호", 22, "대전");
		Member mem2 = new Member("정보규", 32, "서울");
		Member mem3 = new Member("장수연", 29, "광주");
		Member mem4 = new Member("이상엽", 42, "부산");
		
		ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("d:/D_Other/memObj.bin"));
		try {
			//객체를 파일에 저장하기
			
			//쓰기 작업
			oos.writeObject(mem1); //직렬화
			oos.writeObject(mem2); //직렬화
			oos.writeObject(mem3); //직렬화
			oos.writeObject(mem4); //직렬화
			
			oos.close();
			
			System.out.println("쓰기작업 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/D_Other/memObj.bin"));
		
		Object obj = null;
		
		try {
			while((obj = ois.readObject()) != null) {
				//읽어온 데이터를 원래의 객체로 변환 후 사용한다. (캐스팅)
				Member mem = (Member) obj;
				System.out.println("이름 : " + mem.getName());
				System.out.println("나이 : " + mem.getAge());
				System.out.println("주소 : " + mem.getAddr());
			}
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("읽기 완료");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class Member implements Serializable{
	/*
	 * transient > 직렬화가 되지 않을 멤버변수에 지정한다.
	 * (static변수도 직렬화 대상이 아니다.)
	 * 직렬화가 되지 않는 멤버변수는 기본값으로 저장된다.
	 * (참조형 변수 : null, 숫자형 변수 : 0)
	 */
	
	private transient String name;
	private int age;
	private String addr;
	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
}
