package ex0701;
//CH06-1(매개변수 한개)
public class ex01 {

	public static void doA() {
		
	}
	public static void doA(int a) {//int a=숫자만받을수있음(매개변수 한개)
		System.out.println("doA 메소드 시작");
		System.out.println("a="+a);
		System.out.println("doA 메소드 끝");
	}
	public static void main(String[] args) {
		System.out.println("start");
		doA(13);
		doA(20);
		System.out.println("end");
		
	}
}
