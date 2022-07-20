package ex0711;
//page 237
public class Accumulator {

	private static int Max=345;
	
	private int sum=0;
	
	public static void add(int i) {
		sum=sum+i;
	}
	public static void showResult() {
		System.out.println("sum="+sum);
	}
}
