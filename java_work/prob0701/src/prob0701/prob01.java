package prob0701;
//page142
import java.util.Scanner;

public class prob01 {

//	public static void main(String[] args) {
//		System.out.println("사칙연산 시작");
//		hieveryone(5,2);
//		hieveryone(4,3);
//		System.out.println("사칙연산 끝");
//	}
//	public static void hieveryone() {
//		System.out.println("두 정수를 더한 값은"++"입니다");
//		System.out.println("두 정수를 뺀 값은"+minus+"입니다");
//		System.out.println("두 정수를 곱한 값은"+sum+"입니다");
//		System.out.println("두 정수를 나눈 몫은"+divid+"입니다");
//		System.out.println("두 정수를 나눈 나머지는"+remain+"입니다");
//	}
//}

//import java.util.Scanner;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int num1=scan.nextInt();
		System.out.println("두번째 수 입력");
		int num2=scan.nextInt();
		add(num1,num2);
		minus(num1,num2);
		sum(num1,num2);
		division(num1,num2);
		remain(num1,num2);
		
	}
	public static void add(int n1, int n2) {
		System.out.println("n1+n2="+n1+n2);		
	}
	public static void minus(int n1, int n2) {
		System.out.println("n1-n2="+(n1-n2));		
	}
	public static void sum(int n1, int n2) {
		System.out.println("n1*n2="+n1*n2);		
	}
	public static void division(int n1, int n2) {
		System.out.println("n1/n2="+n1/n2);		
	}
	public static void remain(int n1, int n2) {
		System.out.println("remain="+n1%n2);		
	}
	
}