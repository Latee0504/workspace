package ㅅ_메서드_문제_1;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        test16(a);
    }
    public static void test16(int num1){
        for (int i = 0; i<=num1; i++){
            System.out.println(i);
        }
    }
}
