package service;

import java.util.List;

import controller.MainController;
import dao.MemberDao;
import vo.MemberVo;

public class MemberService {
	private static MemberService instance = null;
	
	private MemberService() {

	}

	public static MemberService getInstance() {

		if (instance == null) {
			instance = new MemberService();
		}
		return instance;
	}
	MemberDao memberDao = MemberDao.getInstance();
	
	public boolean login(List<Object> param) {
		MemberVo member = memberDao.login(param);
		if(member == null) {
			return false;
		}
		MainController.sessionStorage.put("member", member);
		return true;
	}
	
}
