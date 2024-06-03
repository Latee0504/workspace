package ㄹ_IF_문제_3;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~99까지의 정수를 입력하세요 : ");
        int a = sc.nextInt();

        int n1 = a / 10; // 10의 자리 수
        int n2 = a % 10; // 1의 자리 수

        if(a >= 1 && a <= 99){
            if(n1 % 3 == 0 && n2 % 3 == 0 && n1 != 0){
                System.out.println("박수짝짝");
            }
            else if(n1 % 3 == 0 || n2 % 3 == 0){
                System.out.println("박수짝");
            }
            else{
                System.out.println();
            }
        }
        else{
            System.out.println();
        }
    }
}
