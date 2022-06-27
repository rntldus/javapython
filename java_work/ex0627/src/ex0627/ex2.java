package ex0627;
//CH4-2 증가 및 감소 연산자
public class ex2 {

	public static void main(String[] args) {
		
		//ctrl+shift+f 자동정렬 but 괄호의 갯수가 맞지 않으면 정상적으로 작동안됨
		
		int num=5;
		
		System.out.print(num++);//println에서 ln 없애면 줄안바꾸고 딱붙어서 정렬
		System.out.print(num);
		System.out.println();//줄바꿈
		System.out.println(num--);
		System.out.println(num);
		
		System.out.println(++num);
		
	}
}
