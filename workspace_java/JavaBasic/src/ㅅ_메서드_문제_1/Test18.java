package ㅅ_메서드_문제_1;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        int a = 1;
        int b = 81;
        test18(a,b);
    }

    public static void test18(int num1, int num2){
        int max;
        int min;
        int count = 0;

        if (num1 > num2){
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }
        for (int i = min+1; i < max; i++){
            if (i % 5 == 0){
                count +=1;
            }
        }
        System.out.println("두 정수 사이 5의 배수의 개수 : " + count);
    }
}

