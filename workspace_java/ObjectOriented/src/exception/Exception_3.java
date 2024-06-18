package exception;

//예외전가
public class Exception_3 {
    public static void main(String[] args) {
        bbb();
    }

    public static void aaa()throws Exception{ //예외 처리 안 하고 던져버림.
        System.out.println(5/0);
    }
    public static void bbb(){
//            aaa();
    }
}
