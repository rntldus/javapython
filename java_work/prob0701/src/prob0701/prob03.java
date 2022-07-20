package prob0701;
//CH06-3
public class prob03 {
//page 154
	
	public static void main(String[] args) {
		int result = doA(3);
		System.out.println("result="+result);
		result = doA(5);
		System.out.println("result="+result);
		
	}
//doA=3 -> n=3 => else return 2*doA(2) -> 2*2*doA(1) -> 2*2*2*doA(0) => return 2*2*2*1
	
	public static int doA(int n) {
		if (n==0)
			return 1;
		else
			return 2*doA(n-1);
	}
}
