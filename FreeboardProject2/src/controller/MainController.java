package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.FreeService;
import service.MemberService;
import util.ScanUtil;
import util.View;
import view.Print;
import vo.FreeVo;

public class MainController extends Print {

	static public Map<String, Object> sessionStorage = new HashMap<>();
	FreeService freeService = FreeService.getInstance();
	MemberService memberService = MemberService.getInstance();

	public static void main(String[] args) {
		new MainController().start();

	}

	private void start() {
		View view = View.HOME;
		while (true) {
			switch (view) {
			case HOME:
				view = home();
				break;
			case BOARD_LIST:
				view = boardList();
				break;
			case BOARD_DETAIL:
				view = boardDetail();
				break;
			case FREE_INSERT:
				view = freeInsert();
				break;
			case MEMBER_LOGIN:
				view = login();
				break;
			case FREE_LIST:
				view = freeList();
				break;
			default:
				break;
			}
		}
	}

//	private boolean logInCheck() {
//		if() {
//			
//			return true;
//		}
//		else
//			false;
//	}
	private View login() {
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");

		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);

		View view = (View) sessionStorage.get("view");
		if (!memberService.login(param)) {
			System.out.println("1. 다시 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 뒤로가기");

			int sel = ScanUtil.menu();
			if (sel == 1)
				return View.MEMBER_LOGIN;
			if (sel == 2)
				return View.MEMBER_SIGN;
			if (sel == 3) {
				return View.HOME;
			}
		}
		if(view == null) return View.HOME;
		
		return view;
	}
	private View freeList() {
		Map<String, Integer> map = new HashMap();
//		int page = ScanUtil.nextInt("페이지 입력 (1, 2) : ");
//		map.put("page", page);
		List<Object> param = freeService.getPaging(map);
		List<FreeVo> freeList = freeService.freeList(param);
		for(FreeVo freeVo : freeList) {
			System.out.println(freeVo);
		}
		System.out.println("<이전페이지     다음페이지>");
		String sel = ScanUtil.nextLine("메뉴 선택하세요");
		int page = 1;
		if(sel.equals("<")) {
			if(sessionStorage.containsKey("page")) {
				page = (int)sessionStorage.get("page");
				if(page == 1) page = 1;
				else page--;
			}
		}
		if(sel.equals(">")) {
			if(sessionStorage.containsKey("page")) {
				page = (int)sessionStorage.get("page");
				if(page == 1) page = 1;
				else page++;
			}
		}
		return null;
	}

	private View freeInsert() {
		System.out.println("인서트 페이지");
		if (!sessionStorage.containsKey("member")) {
			sessionStorage.put("view", View.FREE_INSERT);
			return View.MEMBER_LOGIN;
		}
		return View.BOARD_LIST;
	}

	private View boardDetail() {
		System.out.println("===상세 게시판===");
		System.out.println("1. 수정");
		System.out.println("2. 삭제");
		System.out.println("3. 전체 게시판");
		int sel = ScanUtil.menu();

		switch (sel) {
		case 1:
			return View.BOARD_UPDATE;
		case 2:
			return View.BOARD_DELETE;
		default:
			return View.BOARD_LIST;
		}
	}
	
	private View boardList() {
		List<Map<String, Object>> list = freeService.getList();

		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
		System.out.println("===전체 게시판===");
		System.out.println("1. 상세 게시판 조회");
		System.out.println("2. 게시판 등록");
		System.out.println("3. 홈");
		int sel = ScanUtil.menu();

		switch (sel) {
		case 1:
			return View.BOARD_DETAIL;
		case 2:
			return View.FREE_INSERT;
		default:
			return View.HOME;
		}
	}

	private View home() {
		System.out.println("===홈===");
		System.out.println("1. 전체 게시판 조회");
		System.out.println("2. 게시판 등록");
		System.out.println("3. 페이지 검색");
		int sel = ScanUtil.menu();

		switch (sel) {
		case 1:
			return View.BOARD_LIST;
		case 2:
			return View.FREE_INSERT;
		case 3:
			return View.FREE_LIST;
		default:
			return View.HOME;
		}
	}

}
