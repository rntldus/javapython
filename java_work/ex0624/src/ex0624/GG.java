package ex0624;

public class GG {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=30;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		
		System.out.println(num1<num2&&num2<num3);//num1<num2<num3 한번에세개적는거불가능->&&(그리고)쓰기
		System.out.println(num1>num2&&num2<num3);//앞이false이면 뒤에연산X
		
		System.out.println(!true);//!=부정
	}
}
