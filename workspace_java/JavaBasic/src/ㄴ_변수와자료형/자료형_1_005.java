package ㄴ_변수와자료형;//자료형이 다르면 데이터 저장 불가능

//자바는 크게 기본 자료형과 참조자료형으로 데이터의 형태를 구분
//기본 자료형은 총 8개이다.
//참조 자료형은 무한대.

//기본자료형
//정수 타입 : byte, short, int, long
//실수 타입 : float, double
//논리 타입 : boolean
//문자 타입 : char

//문자열 타입 : String -> 기본 자료형 아님.
public class 자료형_1_005 {
    public static void main(String[] args) {
        byte n1 = 100;
        // byte n2 = 1000; byte 범위 초과로 오류.

        int n2 = 100;

        double n3 = 10.5;


        boolean b1 = true;
        boolean b2 = false;

        //문자열 (쌍따움표로 감쌈)
        String s1 = "java";
        String s2 = "false";
        //String s3 = false;

        //문자(한 글자 + 홀따움표로 감쌈)
        char c1 = 'a';
        System.out.println("c1 = " + c1);
        char c2 = 65;
        System.out.println("c2 = " + c2);

        char c3 = 'A';
        int c4 = c3;

        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        String aaa= "A";
    }
}
