package ㄹ_조건문;

import java.util.Scanner;

public class 예제_3 {
    public static void main(String[] args) {
        //키보드로 정수 하나를 입력 받아서
        //입력받은 정수가 3의 배수이면서 5의 배수 일 때만
        //'1'을 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();

        if(a % 3 == 0 && a % 5 == 0){
            System.out.println(1);
        }
    }
}
