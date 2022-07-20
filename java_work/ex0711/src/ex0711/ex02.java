package ex0711;

public class ex02 {

	public ex02() {
		System.out.println("기본생성자");
	}
	
	public ex02(int a) {
		System.out.println("파리메타 1개 a="+a);
	}
	public ex02(int a, int b) {
		System.out.println("파리메타 2개 a="+a);
		System.out.println("파리메타 2개 b="+b);
	}
	public static void main(String[] args) {
		new ex02();
		new ex02(10);
		new ex02(10,20);
		
	}
}
