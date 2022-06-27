package ex0627;

public class ex01 {

	public static void main(String[] args) {
		
		// 변수 선언, 변수의 사용용도에 따라 int, double(실수), String, boolean(참거짓)
		// 형변환(자동형변환, 수동형변환)
		
		int a=10;//int=4byte
		double b=a;//double=8byte
		
		double c=38.44;
		int d=(int)c;//double을 int에 넣으면 byte작기때문에 소실
		System.out.println("b="+b);
		System.out.println("d="+d);
		
		System.out.println("(3+4)*5="+(3+4)*5);
		System.out.println("3>4="+(3>4));
		
		int num1=3;
		System.out.println("3>4="+(3>4 && (num1+=3)<3));//3>4가 거짓이기때문에 뒤에 연산안함
		System.out.println("num1="+num1);
		System.out.println("3>4="+(3>4 || (num1+=3)<3));//or기호는 오른쪽항을 왼쪽항에 넣음
		System.out.println("num1="+num1);
		
		//num++
		//num+=1
		//num=num+1
		//num=++num
		//num
	}
}
