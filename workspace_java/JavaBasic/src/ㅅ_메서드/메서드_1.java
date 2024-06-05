package ㅅ_메서드;

//method -> 함수(function)
//메서드는 반복해서 실행하는 코드를 미리 하나의 기능으로 정의, 기능성자
//메서드의사용은 크게 메서드 정의 부분과 메서드 호출 부분으로 나뉨.
//메서드를 사용하려면 반드시 메서드 정의 후 호출을 해야함.

//메서드의 정의는 클래스 안, 다른 매서드 밖에서 선언한다.
//메서드는 필요한 만큼 정의할 수 있음.
//메서드명은 중복 불가(대소문자 구분)
//메서드명은 항상 소문자로 작명한다.

//메서드의 호출은 메서드의 정의 안에서 호출
//메서드를 호출할 때는 정의한 메서드명을 반드시 일치시켜야 함.
//메서드를 호출할 때는 정의한 메서드의 매개변수 정보를 일치시켜야 함.
//매개변수 정보 : 매개변수의 자료형, 매개변수의 개수

//메서드의 정의 문법
/*
    접근제한자 리턴타입 메서드명(매개변수정보){

    }

    public static void 메서드명(){

    }

*/

public class 메서드_1 {
    //메서드의 정의
    public static void hello() {
        System.out.println("hello~");
    }

    public static void Hello() {
        System.out.println("hello~");
    }
//    public static void 메서


    public static void main(String[] args) {
        hello();


    }
}