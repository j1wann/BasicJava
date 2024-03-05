package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import print.Print;
import service.MemberService;
import util.ScanUtil;
import util.View;

public class MainController extends Print {

	static public Map<String, Object> sessionStorage = new HashMap<>();
	MemberService memberService = MemberService.getInstance();
	
	
	
	public static void main(String[] args) {
		new MainController().start();
	}

	private void start() {
		View view = View.MAIN;
		while (true) {
			switch (view) {
			case MAIN:
				view = home();
				break;
			case MEMBERLIST:
				view = memberList();
				break;
			case SIGN:
				view = sign();
				break;
			case LOGIN:
				view = login();
				break;
			default:
				break;
			}
		}
	}

	private View sign() {
		System.out.println("회원가입 메뉴");
		System.out.println("개인정보 입력 회원가입 됨");
		System.out.println("1. 홈");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.MAIN;
		default:
			return View.SIGN;
		}
	}

	private View login() {
		System.out.println("로그인 메뉴");
		
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);
		boolean loginChk = memberService.login(param);
		if(loginChk) {
			Map<String, Object> member = (Map<String, Object>) sessionStorage.get("mem");
			System.out.println(member.get("MEM_NAME") + "님 환영합니다.");
		}
		else {
			System.out.println("ID, PW 일치하지 않습니다.");
			return View.LOGIN;
		}
		
		System.out.println("1. 홈");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.MAIN;
		default:
			return View.LOGIN;
		}
	}

	private View memberList() {
		System.out.println("멤버리스트 메뉴");
		String memLike = ScanUtil.nextLine("취미 입력 : ");
		List param = new ArrayList();
		param.add(memLike);
		
		List<Map<String, Object>> memberList = memberService.memberList(param);
		for(Map<String, Object> map : memberList) {
			System.out.print(map.get("MEM_NAME"));
			System.out.print("\t");
		}
		System.out.println();
		System.out.println("1. 홈");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.MAIN;
		default:
			return View.MEMBERLIST;
		}
	}

	private View home() {
		System.out.println("1. 회원 리스트 조회");
		System.out.println("2. 회원 가입");
		System.out.println("3. 로그인");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.MEMBERLIST;
		case 2:
			return View.SIGN;
		case 3:
			return View.LOGIN;
		default:
			return View.MAIN;

		}
	}

}
