package ex0627;
//CH5-2 switch와 break
public class ex07 {

	public static void main(String[] args) {
		
		int n=1;
		
		//swi + ctrl + space키 자동완성
		switch (n) {
		case 1:
			System.out.println("n==1");
			//break;
		case 2:
			System.out.println("n==2");
			//break;
		case 3:
			System.out.println("n==3");
			break;//break 만나면 뒤에것들 실행안됨
		default:
			System.out.println("default");
			break;
		}
		System.out.println("끝");
	}
}
