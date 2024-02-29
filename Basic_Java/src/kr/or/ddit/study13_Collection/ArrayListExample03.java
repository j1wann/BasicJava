package kr.or.ddit.study13_Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample03 {
	public static void main(String[] args) {
		Student s1 = new Student("학생1", "20");
		Student s2 = new Student("학생2", "30");
		Student s3 = new Student("학생3", "40");
		List<Student> l1 = new ArrayList();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);

		
		for(Student str : l1) {
			if(str.name.equals("학생1")) {
				System.out.print("학생1의 나이는 ");
				System.out.println(str.age);
			}
		}
		Student rmStudent = l1.remove(1);
		System.out.println("삭제된 학생 이름 : "+ rmStudent.name + " 나이 : " + rmStudent.age);
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i).age);
			System.out.println(l1.get(i).name);
		}
		System.out.println(l1.get(1).age);
	}
}
class Student{
	String name;
	String age;
	
	Student(String name, String age){
		this.name = name;
		this.age = age;
	}
}