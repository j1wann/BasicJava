package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.FreeDao;
import vo.FreeVo;

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

	public List<Map<String, Object>> getList() {

		return freeDao.getList();
	}

	public List<Object> getPaging(Map<String, Integer> map){
		int	size = 5;
		if(map.containsKey("size")) size = map.get("size");
		int pageNo = 1;
		if(map.containsKey("page")) pageNo = map.get("page");
		int startNo = 1 + (pageNo-1)*size;
		int endNo = pageNo*size;
		List<Object> result = new ArrayList();
		result.add(endNo);
		result.add(startNo);
		return result;
	}

	public List<FreeVo> freeList(List<Object> param) {
		
		return freeDao.freeList(param);
	}

}
