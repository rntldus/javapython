package ex0713;
//CH14
class Man{
	private String name;
//alt+shift+s=>o
	public Man(String name) {
		super();
		this.name = name;
	}
//alt+shift+s=>s
	@Override
	public String toString() {
		return "Man [name=" + name + "]";
	}
	
}
public class Bizman extends Man{
//부모클래스에 기본생성자 선언 or 자식클래스에 부모생성자랑 동일한 생성자 선언
	public Bizman(String name) {
		super(name);
	}
	public static void main(String[] args) {
		Bizman biz=new Bizman("홍길동");
		System.out.println(biz);
	}

}
