package kr.or.ddit.study10;

import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) {
		ThrowExample te = new ThrowExample();
		try {
			String nickname = te.inputNick();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public String inputNick() throws Exception {
		Scanner sc = new Scanner(System.in);
		String nickname = sc.next();
		if(nickname.contains("18")) {
			throw new Exception(); 			
		}
		
		return nickname;
	}
}
