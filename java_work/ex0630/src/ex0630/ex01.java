package ex0630;
//CH05-3
public class ex01 {

	public static void main(String[] args) {
		
		int num=0;
		while (num<5) {
			System.out.println("num="+num);
			num=num+2;
		}
		for (int num1=0; num1<5; num1=num1+2) {
			System.out.println("num1="+num1);
		}
	}
}
