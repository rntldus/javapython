package ex0630;
//CH05-4
public class ex03 {

	public static void main(String[] args) {
		
		int num=1;
		boolean search=false;
		while (num<100) {
			if (num%5==0 && num%7==0) {
				search=true;
				break;
			}
			num++;
		}
		if (search)
			System.out.println("num="+num);
	}
	
}
