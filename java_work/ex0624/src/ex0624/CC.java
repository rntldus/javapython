package ex0624;

public class CC {

	public static void main(String[] args) {
		short a=10;
		short b=20;
		
		System.out.println("a+b="+(a+b));
		
		short c=(short)(a+b); //short는 2바이트이기때문에 a+b가 들어가지못함->바꿔주기
		System.out.println("c="+c);
		
	}
	
}
