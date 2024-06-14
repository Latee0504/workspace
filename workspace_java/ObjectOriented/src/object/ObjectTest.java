package object;

import class_basic.Monitor;

public class ObjectTest {
    public static void main(String[] args) {

        Object obj = new Object();
        //equals() : 매개변수로 들어온 데이터와 현재의 데이터가 같은지 판단하는 메서드.
        //데이터마다 같다는 기준이 다르기 때문에 기준을 개발자가 재정의해서 사용.
        Person p1 = new Person();
        p1.name = "java";
        p1.age = 20;


        Person p2 = new Person();
        p2.name = "java";
        p2.age = 20;

        System.out.println(p1.equals(p2));

        //toString() : 데이터를 문자열로 표현
        //데이터마다 같다는 기준이 다르기 때문에 기준을 개발자가 재정의해서 사용.
        System.out.println(p1.toString());
        System.out.println(p1);

    }
}
