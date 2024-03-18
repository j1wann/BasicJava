package controller;

import java.util.HashMap;
import java.util.Map;

import util.ScanUtil;
import util.View;
import view.Print;

public class MainController extends Print {

	static public Map<String, Object> sessionStorage = new HashMap<>();

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
			case NOTICE:
				view = notice();
				break;
			case LOGIN:
				view = login();
				break;
			case AD_LOGIN:
				view = adminLogin();
				break;
			case MEM_LOGIN:
				view = memberLogin();
				break;
			case AD_HOME:
				view = adminHome();
				break;
			case MEM_HOME:
				view = memberHome();
				break;
			case MEM_SIGN:
				view = memberSign();
				break;
			case MY_PAGE:
				view = myPage();
				break;
			case BOOK_SEARCH:
				view = bookSearch();
				break;
			case INFO:
				view = info();
				break;
			case ROOM:
				view = room();
				break;
			case PASS_UPDATE:
				view = passUpdate();
				break;
			case TEL_UPDATE:
				view = telUpdate();
				break;
			case ADDR_UPDATE:
				view = addrUpdate();
				break;
			case NAME_UPDATE:
				view = nameUpdate();
				break;
			case REVIEW_INSERT:
				view = reviewInsert();
				break;
			case REVIEW_DETAIL:
				view = reviewDetail();
				break;
			case REVIEW_DELETE:
				view = reviewDelete();
				break;
			case REVIEW_UPDATE:
				view = reviewUpdate();
				break;
			case MANAGE:
				view = manage();
				break;
			case BOOK_MNG:
				view = bookManage();
				break;
			case MEMBER_MNG:
				view = memberManage();
				break;
			case RENT_MNG:
				view = rentManage();
				break;
			case REVIEW_MNG:
				view = reviewManage();
				break;
			default:
				break;
			}
		}
	}

//   ===========================================리뷰==========================================================

	private View reviewUpdate() {
		System.out.println("====리뷰 수정====");
		System.out.println("1. 홈");
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.MEM_HOME;
		default:
			return View.MEM_HOME;
		}

	}

	private View reviewDelete() {
		System.out.println("====리뷰 삭제====");
		System.out.println("1. 홈");
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.MEM_HOME;
		default:
			return View.MEM_HOME;
		}

	}

	private View reviewDetail() {
		System.out.println("====리뷰 상세 조회====");
		System.out.println("1. 홈");
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.MEM_HOME;
		default:
			return View.MEM_HOME;
		}

	}

	private View reviewInsert() {
		System.out.println("====리뷰 삽입====");
		System.out.println("1. 홈");
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.MEM_HOME;
		default:
			return View.MEM_HOME;
		}

	}

//   ===========================================도서==========================================================

	private View bookSearch() {
		System.out.println("====도서검색====");
		System.out.println("1. 홈");
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.MEM_HOME;
		default:
			return View.MEM_HOME;
		}

	}

//   ===========================================스터디룸========================================================
	private View room() {
		System.out.println("스터디룸");
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.MEM_HOME;
		default:
			return View.MEM_HOME;
		}
	}

// =============================================관리자========================================================

	private View adminHome() {
		System.out.println("1. 공지사항");
		System.out.println("2. 도서 검색");
		System.out.println("3. 스터디룸");
		System.out.println("4. 도서대여");
		System.out.println("5. 도서반납");
		System.out.println("6. 관리");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.NOTICE;
		case 2:
			return View.BOOK_SEARCH;
		case 3:
			return View.ROOM;
		case 4:
			return View.BOOK_RENT;
		case 5:
			return View.BOOK_RETURN;
		case 6:
			return View.MANAGE;
		default:
			return View.AD_LOGIN;
		}
	}

	private View manage() {
		System.out.println("1. 회원 관리");
		System.out.println("2. 도서 관리");
		System.out.println("3. 대여 관리");
		System.out.println("4. 리뷰 관리");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");

		switch (sel) {
		case 1:
			return View.MEMBER_MNG;
		case 2:
			return View.BOOK_MNG;
		case 3:
			return View.RENT_MNG;
		case 4:
			return View.REVIEW_MNG;
		default:
			return View.MANAGE;
		}
	}

	private View memberManage() {
		System.out.println("회원목록 출력(페이징)");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.MEM_SEARCH;
		case 2:
			return View.MEM_UPDATE;
		case 3:
			return View.MEM_DELETE;
		default:
			return View.MEMBER_MNG;
		}

	}

	private View bookManage() {
		System.out.println("도서 목록 출력...");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 수정");
		System.out.println("3. 도서 삭제");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.BOOK_INSERT;
		case 2:
			return View.BOOK_UPDATE;
		case 3:
			return View.BOOK_DELETE;
		default:
			return View.HOME;
		}
	}

	private View rentManage() {

		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.BOOK_SEARCH;
		case 2:
			return View.BOOK_INSERT;
		case 3:
			return View.BOOK_UPDATE;
		default:
			return View.BOOK_DELETE;
		}
	}

	private View reviewManage() {
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.REVIEW_DETAIL;
		case 2:
			return View.REVIEW_INSERT;
		case 3:
			return View.REVIEW_UPDATE;
		default:
			return View.BOOK_DELETE;
		}
	}

//   ============================================회원==========================================================

	private View memberHome() {
		System.out.println("1. 공지사항");
		System.out.println("2. 도서 검색");
		System.out.println("3. 스터디룸");
		System.out.println("4. 마이페이지");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.NOTICE;
		case 2:
			return View.BOOK_SEARCH;
		case 3:
			return View.ROOM;
		case 4:
			return View.MY_PAGE;
		default:
			return View.MEM_LOGIN;
		}
	}

	private View myPage() {
		System.out.println("1. 내 정보");
		System.out.println("2. 내 대여 현황");
		System.out.println("3. 내가 작성한 리뷰");
		System.out.println("4. 스터디룸 예약");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.INFO;
		case 2:
			return View.BRENT_HISTORY;
		case 3:
			return View.MY_REVIEW;
		case 4:
			return View.ROOM_RENT;
		default:
			return View.MANAGE;
		}
	}

	private View info() {
		System.out.println("1. 비밀번호 수정");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 주소 수정");
		System.out.println("4. 이름 수정");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.PASS_UPDATE;
		case 2:
			return View.TEL_UPDATE;
		case 3:
			return View.ADDR_UPDATE;
		case 4:
			return View.NAME_UPDATE;
		default:
			return View.MANAGE;
		}
	}

	private View passUpdate() {
		System.out.println("====비밀번호 수정====");
		return null;
	}

	private View telUpdate() {
		System.out.println("====전화번호 수정====");
		return null;
	}

	private View addrUpdate() {
		System.out.println("====주소 수정====");
		return null;
	}

	private View nameUpdate() {
		System.out.println("====이름 수정====");
		return null;
	}

//   =======================================로그인=====================================================================

	private View login() {
		System.out.println("1. 관리자 로그인");
		System.out.println("1. 회원 로그인");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.AD_LOGIN;
		case 2:
			return View.MEM_LOGIN;
		default:
			return View.LOGIN;
		}
	}

	private View memberSign() {

		return null;
	}

	private View memberLogin() {

		return null;
	}

	private View adminLogin() {
		System.out.println("I");
		int sel = ScanUtil.nextInt("로그인완료");
		switch (sel) {
		case 1:
			return View.AD_LOGIN;
		case 2:
			return View.MEM_LOGIN;
		default:
			return View.LOGIN;
		}
	}

//   ========================================공지사항=================================================================

	private View notice() {
		System.out.println("=====공지사항=====");
		System.out.println("1. 홈");
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.MEM_HOME;
		}

		return null;
	}

//  ========================================홈====================================================================
	private View home() {
		System.out.println("1. 공지사항");
		System.out.println("2. 도서검색");
		System.out.println("3. 스터디룸");
		System.out.println("4. 로그인");

		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.NOTICE;
		case 2:
			return View.BOOK_SEARCH;
		case 3:
			return View.LOGIN;
		case 4:
			return View.ROOM;
		default:
			return View.HOME;
		}
	}

}