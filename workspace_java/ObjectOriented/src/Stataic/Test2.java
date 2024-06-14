package Stataic;

//클래스를 배우기 전에는 왜 메서드에 static을 붙였는가
public class Test2 {
    public static void main(String[] args) {
//        aaa(); //static을 먼저 해석하므로 메서드를 인식 못 하여 오류발생
    }
    public void aaa(){
        System.out.println("111");
    }
}
