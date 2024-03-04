package kr.or.ddit.homework.home10;

public class Grade {
	int math;
	int kor;
	int eng;
	int total;
	double avg;

	public Grade(int math, int kor, int eng) {
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		this.total = math+kor+eng;
		this.avg = this.total/3.0;
	}

	@Override
	public String toString() {
		return "Grade [math=" + math + ", kor=" + kor + ", eng=" + eng + ", total=" + total + ", avg=" + avg + "]";
	}
	
	
	

}
