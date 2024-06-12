package 상속;

//상속 : 부모 클래스의 멤버변수와 메서드를 물려 받는 것.
//상속 사용 이용 : 코드의 재활용(초보자들이 상속을 이해하는 개념)
//숙련자기준     :  연관성이 없는 다수의 클래스들에 연관성을 부여하여
//                데이터의 관리를 효율적으로 할 수 있게 만들어 주는 기능

//Man : 부모 클래스, super클래스, 상위 클래스
//Businessman 자식 클래스, sub클래스, 하위 클래스

public class Man {
    String name;

    public Man(){}

    //생성자
    public Man(String name) {
        this.name = name;
    }

    public void tellName() {

        System.out.println("이름은 홍길동입니다.");
    }
}
//상속 받은 클래스의 생성자 가장 첫 번째 줄에는 suepr()라는 메서드가 숨겨져있다. *****
//super() : 부모클래스의 기본(디폴트, 매개변수 없는)생성자를 호출하는 기능
//this() : 현재 클래스의 생성자 호출
class Businessman extends Man {
    String company;

//    public Businessman(){
//        super(); //정보처리기사 단골문제
//        System.out.println("생성자 호출");
//    }

    public void tellCompany(){
        System.out.println("저는 삼성에 다닙니다.");
    }

}