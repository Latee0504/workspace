package Interface;

//wrapper 클래스 : 기본자료형을 클래스로 표현한 것.
//wrapper클래스는 기본자료형 처럼 사용하면 된다.
//int -> Integer
//double -> Double
//boolean -> Boolean
//float -> Float

public class BoxTest {
    public static void main(String[] args) {
        //정수 10을 클래스화
        Integer a = Integer.valueOf(10);
        Integer b = 10;



        Box bo = new Box();
        bo.setBox(a); //10 -> Integer
        //
    }
}
