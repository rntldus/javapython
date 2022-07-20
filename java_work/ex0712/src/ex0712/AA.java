package ex0712;
//CH12-1 toString메소드
public class AA {

	private String name;
// alt + shift + s --> s --> enter
	
	public AA(String name) {
		super();
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "AA [name=" + name + "]";
	}
	
	
}
