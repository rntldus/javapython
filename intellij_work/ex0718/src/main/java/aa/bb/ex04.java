package aa.bb;
public class ex04 {
    public static void main(String[] args) {
        try{
            doA();
        }catch (Exception e){
            System.out.println("내가 호출한 메소드 호출 문제");
        }

    }
    public static void doA() throws Exception{
        System.out.println("doA 메소드에서 예외 발생 할 수도 있음");
    }
}
