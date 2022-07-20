package ex0711;
//page 237
public class prob {

	public static void main(String[] args) {
		System.out.println(Accumulator.Max);
		Accumulator acc=new Accumulator();
		for(int i=0; i<10; i++) {
			acc.add(i);
		}
		acc.showResult();
	}
	
}
