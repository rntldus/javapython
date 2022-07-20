package ex0708;

public class ex03 {

	public static void doA() {
		System.out.println("DoA에서도");
	}
	public void doB() {
		System.out.println("DoB에서도");
	}
	
	public static void main(String[] args) {
		ex03.doA();
		ex03 ex03=new ex03();
		ex03.doB();
		//static 메소드는 바로 호출 가능 but static 메소드가 아닌 것은 메모리영역에 할당해야지만 호출 가능
	}
}
