package ex0705;
//참조변수의 특성
//CH07-1
public class ex02 {

	public static void main(String[] args) {
		A a1=new A();
		A a2=a1;
		
		a1.a+=10;
		System.out.println("a2.a="+a2.a);
		
		int a=10;
		int b=a;
		
		a=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
