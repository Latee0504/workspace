package Stataic;

public class InitTest {
    public static void main(String[] args) {
        
        StaticInit i1= new StaticInit();
        StaticInit i2= new StaticInit();
        StaticInit i3= new StaticInit();

        //static 변수를 읽고 사용하는 방법
        //객체명.변수명으로 static 변수도 사용 가능. 추천 X
        System.out.println(i1.num);
        System.out.println(i2.num);

        //static변수 및 메서드는
        //클래스명.변수명으로 접근
        //이러한 접근 방법은 객체를 만들지 않아도 사용 가능하다.
        System.out.println(StaticInit.num);


        //Math 대부분은 static으로 구성됨.
        //Math.random();

      //클래스.static변수.메서드(오버로딩됨)
        System.out.println();

    }
}
