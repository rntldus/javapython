
public class prob05_2_______________________ {
//선생님풀이
	public static void main(String[] args) {
		
		int num1=50;
		int num2=100;
		int result=0;
		
		//num1=200
		System.out.println("num1"+num1);
		System.out.println("num2"+num2);
		
//		int result=num1>num2?num1:num2;
//		System.out.println("result="+result);
//		
//		result=num1>num2?num1-num2:num2-num1;
//		System.out.println("result="+result);
		
		if (num1>num2) {
			result=num1;
		}
		else {
			result=num2;
		}
		System.out.println("result="+result);
		
		if (num1>num2) {
			result=num1-num2;
		}
		else {
			result=num2-num1;
		}
		System.out.println("result="+result);
	}
	
}
