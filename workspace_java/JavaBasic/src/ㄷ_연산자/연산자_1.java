package ㄷ_연산자;

public class 연산자_1 {
    public static void main(String[] args) {
        //산술 연산자 : +, -, *, /, %(나누기 -> 나머지)
        // % mod 연산자
        System.out.println(10 / 4); //2
        System.out.println(10 % 3); //1

        System.out.println(+10);
        System.out.println(-10);

        //비교 연산자 (  == != >= > <= < )
        System.out.println( 5 > 3);

        //논리 연산자(맞다(참), 틀리다(거짓))
        //or and xor nor etc...
        // &&그리고, ||그러나 / 뒤에 연산할 필요가 없다면 종료 -> 사용 권장
        // &그리고, |그러나 / 뒤에 연산할 필요가 없어도 끝까지 실행
        int x = 7;
        boolean r1 = x > 5 && x <= 10;
    }
}
