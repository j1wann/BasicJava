package kr.or.ddit.study13_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapExample3 {
	public static void main(String[] args) {
		MapExample3 hw = new MapExample3();
		hw.process();
	}
	
	public void process() {
		printHistoGram(100);
	}
	
	public void printHistoGram(int num) { //값을 누적할때 제일 많이 사용하는 논리
		Random random = new Random();
		Map<Integer, Integer> resultMap = new HashMap();
		for(int i=0; i<num; i++) {
			int rollDice = random.nextInt(6)+random.nextInt(6)+2;
			int sum = 1;
			if(resultMap.containsKey(rollDice))
				sum+=resultMap.get(rollDice);
			resultMap.put(rollDice, sum);
		}
		for(int i=2; i<=12; i++) {
			System.out.print("합 "+i+"\t");
			for(int star=0; star<100*resultMap.get(i)/num; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}