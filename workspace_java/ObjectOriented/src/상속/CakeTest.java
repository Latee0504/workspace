package 상속;

public class CakeTest {
    public static void main(String[] args) {
        ChesseCake c = new ChesseCake();
        c.eat(); //자식 클래스에서 재정의한 eat가 실행됨.

        //c객체로부터 부모클래스에서 선언한 eat() 메서드를 호출할 수 있는가? 불가능하다.

    }
}
