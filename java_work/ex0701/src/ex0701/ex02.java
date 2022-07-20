package ex0701;
//CH06-1(매개변수 두개)
public class ex02 {

	public static void doA(int age, String name) {//(매개변수 두개)
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
	public static void main(String[] args) {
		doA(13,"aaa");
		doA(20,"bbb");
	}
}
