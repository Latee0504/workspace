package ㄹ_IF_문제_3;

import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~99까지의 정수를 입력하세요 : ");
        int a = sc.nextInt();

        int n1 = a / 10; // 10의 자리 수
        int n2 = a % 10; // 1의 자리 수

        int clapCnt = 0;

        if(n1 == 3 || n1 == 6 || n1 == 9){
            clapCnt+=1;
        }
        if(n2 == 3 || n2 == 6 || n2 == 9){
            clapCnt+=1;
        }
        switch (clapCnt){
            case 1 :
                System.out.println("박수짝");
                break;
            case 2 :
                System.out.println("박수짝짝");

        }
    }
}