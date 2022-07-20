package ex0708;

public class ex02 {

	public static int a=10;
	ex02(){
		System.out.println("a="+a);
	}
	public static void main(String[] args) {
		ex02 ex02=new ex02();
		ex02.a++;
		ex02 ex02_1=new ex02();
		ex02_1.a++;
		
		System.out.println("ex02.a="+ex02.a);
	}
}
