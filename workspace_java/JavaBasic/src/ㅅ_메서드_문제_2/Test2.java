package ㅅ_메서드_문제_2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        test2(num1,num2);

    }
    public static int test2(int a, int b){
        return a * b;
    }
}
