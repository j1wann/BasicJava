package kr.or.ddit.homework.home10;

public class Cylinder {
	int height;
	double volume;
	public Cylinder(int height, Circle c1) {
		this.height = height;
		this.volume = c1.area*height;
	}
	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", volume=" + volume + "]";
	}
	
}
