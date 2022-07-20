package ex0714;
//CH15-2
class Super{
}

class Sub extends Super{
}

class AAA{
}

public class ex02 {

	public static void main(String[] args) {
		Super super1=new Sub();
		Sub sub1=(Sub) super1;
//		AAA a1=new Sub();
		
	}
}
