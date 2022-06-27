package ex0627;
//CH5-1 else if 구문
public class ex05 {

	public static void main(String[] args) {
		
		int num1=-10;
		
		if (num1<0)
			System.out.println("num1<0 is true");//맨위에가 참이면 밑에는 생략
		
		else if (num1<100)
			System.out.println("num1<100 is true");
		
		else
			System.out.println("num1은 100이상");
	}
	
}
