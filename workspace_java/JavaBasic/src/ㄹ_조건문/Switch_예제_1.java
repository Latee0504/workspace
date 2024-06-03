package ㄹ_조건문;

import java.util.Scanner;

public class Switch_예제_1 {
    public static void main(String[] args) {

        //키보드로 정수 하나를 입력 받아,
        //입력받은 값이 짝수이면 '1'을 출력
        //홀수면 '2'를 출력
        //그 밖에는 '0'으로 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();
        int num = a % 2;

        switch (num){
            case 0 : //짝수일 때
                System.out.println(1);
                break;
            case 1: //홀수일 때
                System.out.println(2);
                break;
            default: //그 밖의 경우
                System.out.println(0);
        }
    }
}
