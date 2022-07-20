package ex0711;

public class ex03 {

	ex03(){
		BB b1=new BB();
		
		System.out.println(b1.toString());//toString 적어도되고안적어도됨
		
		System.out.println("abc".equals(new String("abc")));
		System.out.println("abc"==new String("abc"));
		
		String a=12+"";
		String b=String.valueOf(12);
//		String c=12;
	}
	public static void main(String[] args) {
		new ex03();
	}
}
