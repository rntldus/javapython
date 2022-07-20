package aa.bb;
interface AA{
    int AAA=345;//변수
    void doA();//함수
}
class AAA implements AA{
    @Override
    public void doA() {
        System.out.println("AAA 클래스 안에 doA 메소드");
    }
}
// 1. class를 만들어서 상속받아 재정의 하는 방법
// 2. new AA() 인터페이스 생성과 동시에 메소드 재정의 하는 방법
public class ex01 {
    public static void main(String[] args) {

        System.out.println(AA.AAA);
        AAA a1=new AAA();
        a1.doA();
        new AA() {
            @Override
            public void doA() {
                System.out.println("AA 인터페이스 안에 doA 메소드");
            }
        }.doA();//세미콜론 필수
        AA a3=()->{
            System.out.println("a3 람다 안에 doA 메소드");
        };
        a3.doA();
    }
}
