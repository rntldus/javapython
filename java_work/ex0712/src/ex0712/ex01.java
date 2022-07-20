package ex0712;

public class ex01 {
//다음 주민등록번호의 중간에 삽입된 -를 지우고 공백으로 채워서 출력하는 프로그램 작성
	
	public static void main(String[] args) {
		
		String jumin="001107-1234567";
		String a[]=jumin.split("-");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println(a[0]+"-*******");
	}
}
