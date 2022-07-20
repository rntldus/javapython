package ex0708;

class Point{
	int xPos, yPos;
	public Point(int xPos, int yPos) {
		this.xPos=xPos;
		this.yPos=yPos;
	}
	public void showPointInfo() {
		System.out.println("["+xPos+","+yPos+"]");
	}
}

public class Circle {
	Point point;
	int r;
	public Circle(int i, int j, int k) {
		point=new Point(i,j);
		this.r=k;
	}
	public void showPointInfo() {
		System.out.println("반지름 r="+this.r);
		point.showPointInfo();
	}
	public static void main(String[] args) {
		Circle circle=new Circle(2,2,4);
		circle.showPointInfo();		
	}
}
