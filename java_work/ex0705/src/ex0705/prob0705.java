package ex0705;
//CH07_page 176
class Triangle {
	int bottom;
	int height;
	public Traingle() {}
	public Triangle(int bottom, int height) {
		super();
		this.bottom=bottom;
		this.height=height;
	}
//alt+shift+s->o생성자
//alt+shift+s->r getter setter 만들기
	
	public void printArea() {
		double area=this.bottom*this.height*0.5d;
		System.out.println("넓이="+area);
	}
		public void setBottom(int b) {
		bottom=b;
	}
	public void setHeight(int height) {
		this.height=height;
	}
}
public class prob0705 {
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.printArea();
		t1.setHeight(50);
		t1.setBottom(50);
		t1.printArea();
		
		Triangle t2=new Triangle(30,50);
		t2.printArea();
	}
}
