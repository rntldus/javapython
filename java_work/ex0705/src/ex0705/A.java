package ex0705;
//review
public class A {

	public int a=10;
	
	public void doA() {
		System.out.println("doA="+a);
	}
	public int doB() {
		System.out.println("doB="+a);
		return 10;
	}
	public double doC(double c) {
		System.out.println("doC");
		return c*c;
	}
}
