package ㄹ_조건문;

import java.util.Scanner;

public class 예제_2 {
    public static void main(String[] args) {
        //키보드로 정수 하나를 입력받아,
        //입력받은 정수가 '짝수'이면 '1' 출력
        //그 밖이면 '2' 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();


        if (a % 2 == 0) {
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
    }
}
