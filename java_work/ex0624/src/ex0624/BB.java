package ex0624;

import java.util.Scanner;//쓰는거기억하기;java폴더안에util폴더안에scanner라는뜻

public class BB {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);//얘도기억
		
		System.out.println("입력하세요");
		String aa=scan.nextLine();
		System.out.println("aa="+aa);
		
		System.out.println("입력하세요");
		String bb=scan.nextLine();
		System.out.println("bb="+bb);
		
	}
}
