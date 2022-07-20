package ex0714;
//CH15-1
class A{
	public void doA() {
		System.out.println("doA A");
	}
	@Override
	public String toString() {
		return "A []";
	}
}
class B extends A{
	public void doA() {
		System.out.println("doA B");
	}
	@Override
	public String toString() {
		return "B []";
	}
}
class C extends B{
	public void doA() {
		System.out.println("doA C");
	}
	@Override
	public String toString() {
		return "C []";
	}
}
public class ex01 {
//부모클래스는 자식클래스를 참조함 & 오버라이딩된 메소드를 호출함
	public static void main(String[] args) {
		
		A a1=new C();
		A a2=new B();
		A a3=new A();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a1.doA();
		a2.doA();
		a3.doA();
		
	}
}
