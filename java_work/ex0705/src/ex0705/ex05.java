package ex0705;
//CH07-2
public class ex05 {

	public static void doA(String str1, String str2) {
		System.out.println(str1+str2);
	}
	public static void main(String[] args) {
		String a="Happy";
		String b=new String("Happy");//위의명령이랑같음
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		doA(a,b);
	}
}
