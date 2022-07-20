package aa.bb;
public class ex03 {
    public static void main(String[] args) {
        md1(i: 3);
    }

    private static void md1(int i) {
        md2(i, i1: 0);

    }
    private static void md2(int i int i1){
        try{
            System.out.println(i/11);
        }catch(Exception e){
            System.out.println("예외처리");
        }
    }
}
