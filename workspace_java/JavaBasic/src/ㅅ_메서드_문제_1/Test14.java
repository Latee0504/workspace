package ㅅ_메서드_문제_1;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();

        test14(a);
    }


    public static void test14(int num1){
        if (num1 % 2 == 0){
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }
    }
}
