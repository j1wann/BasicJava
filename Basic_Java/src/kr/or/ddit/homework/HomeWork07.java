package kr.or.ddit.homework;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
		obj.process();
	}
	public void process() {
		//로또 번호 6개 출력
		//1. lotto 번호 45개 배열  temp 생성
		//2. temp 배열 섞기 어제 숙제 참고.
		//3. 6개 배열 lotto 생성
		//4. lotto 배열에 temp 앞에 6개 값 복사하기
		//5. 정렬하기
		//6. 결과 출력하기
		int[] temp = new int[45];
		int[] lotto = new int[6];
		for(int i = 0; i < 45; i++)
			temp[i] = i+1;
		
		for(int i = 0; i < 10000; i ++) {
			int ran = new Random().nextInt(temp.length);
			int tmp = temp[0];
			temp[0] = temp[ran];
			temp[ran] = tmp;
		}
		System.out.println("temp 배열 생성");
		System.out.println(Arrays.toString(temp));
		
		System.out.println("앞 6개 값을 가져와서 lotto 배열 생성");
		System.arraycopy(temp, 0, lotto, 0, 6);
		System.out.println(Arrays.toString(lotto));
		
		for(int i = 0; i<lotto.length-1; i++) {
			int minIndex = i;
			for(int j = i; j<lotto.length; j++) {
				if(lotto[j] < lotto[minIndex]) {
					minIndex = j;
				}
			}
			int tmp2 = lotto[minIndex];
			lotto[minIndex] = lotto[i];
			lotto[i] = tmp2;
		}
		System.out.println("정렬");
		System.out.println(Arrays.toString(lotto));
	}
}
