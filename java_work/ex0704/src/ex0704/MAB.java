package ex0704;

public class MAB {

	public static void main(String[] args) {
		
		int a=10;//int=4byte
	    int b=20;
	    
		Account a1=new Account();//위의명령과같은의미임
		Account a2=new Account();
		Account a3=new Account();
		
		a1.deposit(10000);
		a2.deposit(5000);
		a3.deposit(1000);
		
		a1.with(1000);
		a2.with(1000);
		a3.with(1000);
		
		a1.check();//10000-1000=9000
		a2.check();//5000-1000=4000
		a3.check();//1000-1000=0
	}
}
