package prob0630;
//page 129
public class prob05_6 {
//2
	public static void main(String[] args) {
		
		int num=1;//1,3,5,7,9
		int sum=0;
		
		while (true) {
			sum+=num;//sum=sum+num
			num+=2;//num=num+2
			System.out.println("num="+num);
			if (sum>1000)
				break;
			
		}
		System.out.println("sum="+sum);
		
	}
	
}
