package prob0630;
//page122 #3
public class prob05_4 {
	
	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		
		while (num<1001) {
			if (num%2==0 && num%7==0) {
				System.out.println("num="+num);
				sum=sum+num;
			}
			num+=1;
		}
		System.out.println("sum="+sum);				
	}
}
