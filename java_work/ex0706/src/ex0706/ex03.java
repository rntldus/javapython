package ex0706;

class Circle{
//	int rad;
	private int rad;
	final double PI=3.14;
	//atl+shift+s=getters and setters
	public void printArea() {
		System.out.println("넓이는="+PI*rad*rad);
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		if (rad<0) {
			System.out.println("반지름은 음수가 없습니다.");
			return;
		}
		this.rad = rad;
	}	
	
}

public class ex03 {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.setRad(10);
//		c1.rad=10;
	}
}
