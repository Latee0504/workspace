package ㅅ_메서드_문제_1;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        test15(a,b);
    }
    public static void test15(int a, int b){
        if (a % 2 == 0 && b % 2 == 0){
            System.out.println("두 수는 짝수입니다.");
        }
        else if (a % 2 != 0 && b % 2 != 0){
            System.out.println("두 수는 홀수입니다.");
        }
        else {
            System.out.println("한 수만 짝수입니다.");
        }
    }
}
