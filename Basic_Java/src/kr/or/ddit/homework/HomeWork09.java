package kr.or.ddit.homework;

public class HomeWork09 {
	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.method1();
	}
	public void method1() {
		//학생 5명을 만들고 각각 데이터를 입력할 것.
		Student[] scores = new Student[5];
		
		for (int i = 0; i < scores.length; i++) {
	        scores[i] = new Student(); 
	    }
		
		
		scores[0].name = "미연";
		scores[0].kor = 80;
		scores[0].eng = 70;
		scores[0].math = 80;
		
		scores[1].name = "민니";
		scores[1].kor = 90;
		scores[1].eng = 85;
		scores[1].math = 90;
		
		scores[2].name = "소연";
		scores[2].kor = 90;
		scores[2].eng = 70;
		scores[2].math = 75;
		
		scores[3].name = "우기";
		scores[3].kor = 65;
		scores[3].eng = 75;
		scores[3].math = 70;
		
		scores[4].name = "슈화";
		scores[4].kor = 80;
		scores[4].eng = 80;
		scores[4].math = 70;
		
		
		
		//총점 구하기
		for(int i = 0; i < scores.length; i++) {
			scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
		}
		//평균 구하기
		for(int i = 0; i < scores.length; i++) {
			scores[i].avg = scores[i].sum/3;
		}
		//등수 구하기
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j <scores.length; j++) {
				if(scores[i].sum < scores[j].sum )
					scores[i].rank++;
			}
		}
		//출력하기
		for(int i = 0; i<scores.length; i++)
			System.out.println(scores[i]);
		//정렬하기1
		for(int i = 0; i<scores.length-1; i++) {
			for(int j = i+1; j<scores.length; j++) {
				if(scores[i].sum < scores[j].sum) {
					Student temp = new Student();
					temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		}
		System.out.println("높은 등수부터 출력");
		System.out.println("=========================================================================");
		//출력하기
		
		for(int i = 0; i<scores.length; i++)
			System.out.println(scores[i]);
	}
	class Student{
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		int avg;
		int rank=1;
		@Override
		public String toString() {
			return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum
					+ ", avg=" + avg + ", rank=" + rank + "]";
		}
		
	}
}
