package prob0701;
//CH06-1
public class prob02 {
//page 145
	public static double carea(double r) {
		return r*r*3.14;
	}
	public static double cround(double r) {
		return 2*3.14*r;
	}
	public static void main(String[] args) {
		System.out.println("carea(3)="+carea(3));
		System.out.println("crougnd(3)="+cround(3));
	}		
}