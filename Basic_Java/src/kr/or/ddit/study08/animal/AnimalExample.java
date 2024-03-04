package kr.or.ddit.study08.animal;
import java.util.Scanner;
public class AnimalExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal ani = null;
		
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		
		int sel = sc.nextInt();
		if(sel == 1) ani = new Cat();
		if(sel == 2) ani = new Dog();
		
		
	}
}
