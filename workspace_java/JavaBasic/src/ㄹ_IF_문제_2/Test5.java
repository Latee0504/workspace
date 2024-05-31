package ㄹ_IF_문제_2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.println("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("첫 번째 수 :" + a);
        System.out.println("두 번째 수 :" + b);

        if (a > b){
            System.out.println( a + " > " + b);
        }
        else {
            System.out.println( b + " > " + a);
        }
    }
}
