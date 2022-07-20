package ex0712;
//CH13-1 배열기반 반복문 활용
public class ex06 {

	public static void main(String[] args) {
		String ar[]=new String[3];
		System.out.println(ar[0]);
		
		ar[0]="abc";
		ar[1]="bcd";
		ar[2]="test";
		
//		System.out.println(ar[0].length());
//		System.out.println(ar[1].length());
//		System.out.println(ar[2].length()); 반복이라서 for 구문으로 바꿈
		
		for (int i=0; i<3; i++) {
			System.out.println(ar[i].length());
		}
		
		System.out.println("ar[0]="+ar[0]);
	}
	
}
