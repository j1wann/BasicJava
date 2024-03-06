package service;

import java.util.List;
import java.util.Map;

import dao.FreeDao;

public class FreeService {
	private static FreeService instance = null;

	private FreeService() {

	}

	public static FreeService getInstance() {

		if (instance == null) {
			instance = new FreeService();
		}
		return instance;
	}
	FreeDao freeDao = FreeDao.getInstance();
	
	public List<Map<String, Object>> freeList() {
		
		return freeDao.freeList();
	}

	public void freeDelete(List<Object> param) {
		// TODO Auto-generated method stub
		freeDao.freeDelete(param);
	}
	
	
}
