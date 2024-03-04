package kr.or.ddit.homework.home10;
import java.util.Scanner;
public class HomeWork10 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork10 hw = new HomeWork10();
		hw.method1();
//		hw.method2();
//		hw.method3();
//		hw.method4();
	}
	public void method1() {
		// 1. 다음을 만족하는 Student 클래스를 작성하시오.
		// String 학과 정수형의 학번을 필드로 선언
		// 해당 메소드에서 클래스를 생성 및 적당한 값을 입력 후 출력
		Student stu1 = new Student("컴퓨터공학과", 20241652);
		System.out.println(stu1);
	}
	public void method2() {
		// 제조사 생산년도 크기를 출력하는 Tv 클래스를 설계하시오
		Tv tv1 = new Tv(2018, "삼성", 86);
		System.out.println(tv1);
	}
	public void method3() {
		// 세 과목의 성적을 입력받고 충점과 평균을 출력할 수 있는
		// Grade 클래스를 설계하시오
		int[] grade = new int[3];
		System.out.print("수학, 국어, 영어 순으로 성적을 입력하시오");
		for(int i = 0; i <3; i++) {
			grade[i] = sc.nextInt();
		}
		Grade g1 = new Grade(grade[0], grade[1], grade[2]);
		System.out.println(g1);
		
		
	}
	public void method4() {
		// 원통을 나타내는 Cylinder 클래스는 Circle 형의 원과 
		// 실수형의 높이를 필드로 선언
		// 부피를 자동계산 할 것.
		// 부피 구하는 공식 원의 넓이 * 높이 
		Cylinder c1 = new Cylinder(10, new Circle(5.5));
		System.out.println(c1);
	}
}
