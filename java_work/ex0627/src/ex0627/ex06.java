package ex0627;
//CH5-1 상황연산자
public class ex06 {

	public static void main(String[] args) {
		
		int n1=10, n2=20;
		
		int result=n1<n2? n1:n2;//참-> :의 왼쪽 실행
		System.out.println("result="+result);
		
		result=n1<n2? n2-n1:n1-n2;//참-> :의 왼쪽 실행
		System.out.println("result="+result);
		
	}
}
