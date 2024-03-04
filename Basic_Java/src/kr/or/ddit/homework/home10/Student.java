package kr.or.ddit.homework.home10;

public class Student {
	String dp;
	int stuId;
	
	public Student(String dp, int stuId) {
		this.dp = dp;
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return "Student [dp=" + dp + ", stuId=" + stuId + "]";
	}
	
}
