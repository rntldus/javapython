package ex0708;

class A{
	static int o=0;
	A(){
		o++;
		System.out.println("a="+o);
	}
}
public class ex01 {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A();
		A a3=new A();
		
	}

}
