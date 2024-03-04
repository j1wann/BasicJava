package kr.or.ddit.study07.sec02;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.eng = 60;
		s1.kor = 70;
		s1.math = 90;
		s1.name = new String("김철수");
		s1.avg = (s1.eng + s1.kor + s1.math) / 3.0;

		Student s2 = new Student();
		s1.eng = 60;
		s1.kor = 70;
		s1.math = 90;
		s1.name = new String("박지완");
		s1.avg = (s1.eng + s1.kor + s1.math) / 3.0;

		Student s3 = new Student();
		s1.eng = 60;
		s1.kor = 70;
		s1.math = 90;
		s1.name = new String("박철수");
		s1.avg = (s1.eng + s1.kor + s1.math) / 3.0;

		System.out.printf("이름 : %s , 국어 : %d, 수학 : %d, 영어 : %d, 평균 : %.2f", s1.name, s1.kor, s1.math, s1.eng, s1.avg);
	}
}
