package ㅅ_메서드_문제_2;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력 : ");

        int num = sc.nextInt();
        test6(num);
    }
    public static String test6(int a){ //매개변수 a에 num이라는 정수형 변수 들어감
        //정수 -> 문자열
        String bb = String.valueOf(10);
        //문자열 -> 정수
        int aa = Integer.parseInt("10");
        return a +"";
    }
}
