package kr.or.ddit.study13_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample02 {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("a");
		l1.add(1);
		l1.add(10.5);
		
		String s1 = (String)l1.get(0);
		
		List<String> l2 = new ArrayList();
		l2.add("a1");
		l2.add("a2");
		l2.add("a3");
		String s2 = l2.get(0);
		
	}
}
