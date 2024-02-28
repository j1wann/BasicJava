package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
		de.method6();
	}
	public void method6() {
		Calendar cal = Calendar.getInstance();
		//cal.add, cal.set
		cal.add(Calendar.DATE, 20);
		
		Date date = cal.getTime();
		System.out.println(date);
	}
	public void method5() {
		Date date = new Date();
		System.out.println(date);
		//앞으로 100일 후는 몇일일까?
		Date date2 = new Date(date.getTime() + 1000*60*60*24*100);
		System.out.println(date2);
		String str = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(sdf.format(date2));
	}
	public void method4() {
		String str = "2024.09.23";
		//str > Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date date = null;
		try {
			date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date cur = new Date();
		long time = date.getTime() - cur.getTime();
		System.out.println(time);
		
		milliTrans(time);
		
		
	}
	public void milliTrans(long time) {
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour*24;
		long year = (long)(day*365);
		System.out.print(time/year + "년");
		time%=year;
		System.out.print(time/day + "일");
		time%=day;
		System.out.print(time/hour + "시");
		time%=hour;
		System.out.print(time/min + "분");
		time%=min;
		System.out.print(time/sec + "초");
		time%=sec;
	}
	public void method3() {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("z a yyyy.MM.dd hh:mm:s");
		String result = sdf.format(date);
		System.out.println(result);
	}
	public void method2() {
		//Date의 getTime은 특정 시점으로 부터 지난 시간이다.
		//몇년 몇일 몇시간 몇분 몇초 지났는지 출력해보시오
		Date date = new Date();
		long time = date.getTime();
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour*24;
		long year = (long)(day*365);
		System.out.print(time/year + "년");
		time%=year;
		System.out.print(time/day + "일");
		time%=day;
		System.out.print(time/hour + "시");
		time%=hour;
		System.out.print(time/min + "분");
		time%=min;
		System.out.print(time/sec + "초");
		time%=sec;
		
	}
	public void method1() {
		Date date = new Date();
//		System.out.println(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date date2 = new Date();
//		System.out.println(date2);
		
		long time = date2.getTime() - date.getTime();
		System.out.println(time);
		
		System.out.println(date.getTime());
	}
}
