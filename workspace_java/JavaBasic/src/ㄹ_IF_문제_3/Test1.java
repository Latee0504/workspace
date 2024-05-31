package ㄹ_IF_문제_3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 변의 길이를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.println("두 번째 변의 길이를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("세 번째 변의 길이를 입력하세요 : ");
        int c = sc.nextInt();

        if(a + b > c || a + c > b || b + c > a){
            System.out.println("삼각형을 만들 수 있습니다.");
        }
        else {
            System.out.println("삼각형을 만들 수 없습니다.");
        }
    }
}
