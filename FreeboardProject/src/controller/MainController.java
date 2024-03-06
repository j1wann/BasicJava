package controller;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.FreeService;
import util.ScanUtil;
import util.View;
import view.Print;

public class MainController extends Print {
	
	static public Map<String, Object> sessionStorage = new HashMap<>();
	FreeService freeService = FreeService.getInstance();
	
	
	
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
			case FREE_LIST:
				view = freeList();
				break;
			case FREE_INSERT:
				view = freeInsert();
				break;
			case FREE_DETAIL:
				view = freeDetail();
				break;
			case FREE_UPDATE:
				view = freeUpdate();
				break;
			case FREE_DELETE:
				view = freeDelete();
				break;
			default:
				break;
			}
		}
	}

	private View freeUpdate() {
		return View.FREE_LIST;
	}

	private View freeDelete() {
		int no = (int)sessionStorage.get("no");
		List<Object> param = new ArrayList();
		param.add(no);
		
		freeService.freeDelete(param);
		System.out.println("삭제가 완료되었습니다.");
		
		
		return View.FREE_LIST;
	}

	private View freeDetail() {
		System.out.println("1. 게시판 수정");
		System.out.println("2. 게시판 삭제");
		System.out.println("3. 전체 게시판");
		int sel = ScanUtil.nextInt("메뉴를 선택하세요");
		switch (sel) {
		case 1:
			return View.FREE_UPDATE;
		case 2:
			int no = ScanUtil.nextInt("삭제할 게시판 번호 : "); //왜 세션 스토리지에 담아서 보내는지
			sessionStorage.put("no", no);
			return View.FREE_DELETE;
		case 3:
			return View.FREE_LIST;
		default:
			return View.FREE_DETAIL;
		}
	}

	private View freeInsert() {
		// TODO Auto-generated method stub
		return View.FREE_LIST;
	}

	private View freeList() {
		List<Map<String, Object>> freeList = freeService.freeList();
		
		printFreeList(freeList);
		
		
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.FREE_DETAIL;
		case 2:
			return View.FREE_INSERT;
		case 3:
			return View.HOME;
		default:
			return View.FREE_LIST;
		}
	}

	private View home() {
		
		printHome();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.FREE_LIST;
		case 2:
			return View.FREE_INSERT;
		case 3:
			return View.HOME;
		default:
			return View.HOME;
		}
	}

}
