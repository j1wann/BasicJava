package kr.or.ddit.homework;

public class HomeWork01 {
	public static void main(String[] args) {
		//1년은 365.2422일이다.
		//1년은 xxx일x시간x분x초입니다. 출력할 것
		double year = 365.2422;
		int days = (int)year;
		double hour = (year-days) * 24;
		double min = (hour - (int)hour)*60; 
		double sec = (min - (int)min)*60;
		System.out.println("1년은 "+(int)days+"일"+(int)hour+"시간"+(int)min+"분"+(int)sec+"초입니다.");
	}
}