package ㅁ_반복문_문제_2;

import java.util.Scanner;

public class Test2_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("첫 번째 정수 입력 : ");
        int i = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int num = sc.nextInt();

        int total = 0;

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

        for (min += 1; min < max; min++) { // i+1 ~ num-1까지(두 정수 사이)
            total += min;
        }
        System.out.println("두 수 사이의 정수 합계 : " + total);
    }
}
