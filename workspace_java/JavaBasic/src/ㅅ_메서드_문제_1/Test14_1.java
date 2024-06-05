package ㅅ_메서드_문제_1;

import java.util.Scanner;

public class Test14_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();

        test14(a);
    }


    public static void test14(int num1){
        //삼항연산자 맞다면 왼쪽, 아니라면 오른쪽
//        int a = 10 > 5 ? 1 : 2;

        //num1을 2로 나눈 나머지가 0이면? 짝수, 아니라면 홀수 출력
        System.out.println(num1 % 2 == 0 ? "짝수" : "홀수");
    }
}
