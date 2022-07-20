package ex0713;
//CH14-1 상속
class A{
	int a=10;
	public void doA() {
		System.out.println("doA");
	}
}
class B extends A{
	public void doB() {
		doA();
		System.out.println("doB a="+a);
	}
}

public class ex01 {

	public static void main(String[] args) {
		B b=new B();
		b.doB();
		
	}
}
