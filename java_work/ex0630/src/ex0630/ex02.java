package ex0630;
//CH05-4
public class ex02 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if (i==5)// == i의값이5랑같음
				break;
			if (i==1)
				continue;//i가 1이면 print하지않고다음으로넘어감
			System.out.println("i="+i);
		}
		
		
	}
}
