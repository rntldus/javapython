package ex0705;
//CH07-2
public class ex06 {

	public static void main(String[] args) {
		BankAccount a1=new BankAccount("001107", "3976380", 1000000000);
		a1.deposit(2000);
		a1.printbal();
//한줄삭제=ctrl+d
		BankAccount a2=new BankAccount();
	}
}
