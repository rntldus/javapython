package ex0701;
//CH06-1(값 반환)
public class ex03 {

	public static void main(String[] args) {
		doA();//doA호출
		
		int result=doB();//doB호출
		
		System.out.println("result="+result);//doB반환값 호출
		
		double dd=doC();
		System.out.println("dd="+dd);//doC반환값 호출
		
		String ee=doD();
		System.out.println("ee="+ee);//doD반환값 호출
	}
	public static void doA() {
		System.out.println("doA");
		return;//<-적어도되고안적어도됨
	}
	public static int doB() {//숫자반환=int
		System.out.println("doB");
		return 10;
	}
	public static double doC() {//실수반환=double
		return 10.5;
	}
	public static String doD() {//문자반환=String
		return "doD";
	}
}
