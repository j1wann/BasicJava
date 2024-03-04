package kr.or.ddit.homework.home10;

public class Circle {
	double radious;
	double pi = Math.PI;
	double area;
	
	// 원의 넓이 구하는 생성자 만들 것.
	// 원의 넓이 반지름*반지름*PI
	public Circle(double radious) {
		this.radious = radious;
		this.area = radious*radious*this.pi;
	}
	
}
