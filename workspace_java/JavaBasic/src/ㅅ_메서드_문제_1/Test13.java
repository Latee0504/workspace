package ㅅ_메서드_문제_1;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        test13(a,b);

    }
    public static void test13(int num1, int num2){
        System.out.println("두 정수의 합 : " + (num1 + num2));
    }
}
