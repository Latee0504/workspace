package ㅁ_반복문_문제_2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("첫 번째 정수 입력 : ");
        int i = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int num = sc.nextInt();

        int max;
        int min;

        if(i > num){
            max = i;
            min = num;
        }
        else{
            max = num;
            min = i;
        }

        min += 1;

        while(min < max ){
            total += min;
            min++;
        }
        System.out.println("두 수 사이의 정수 합계 : " + total);
    }
}