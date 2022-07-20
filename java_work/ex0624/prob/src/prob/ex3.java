package prob;
/*문제3
다음 계산 결과를 출력하는 프로그램을 작성하되, 덧셈 연산의 횟수를 최소화하여 작성해보자
3+6     3+6+9   3+6+9+12
*/
public class ex3 {

	public static void main(String[] args) {
		
		System.out.println(3+6);
		System.out.println(3+6+9);
		System.out.println(3+6+9+12);
		
		int a=3+6;
		System.out.println(a);
		a+=9;
		System.out.println(a);
		a+=12;
		System.out.println(a);
	}
}
