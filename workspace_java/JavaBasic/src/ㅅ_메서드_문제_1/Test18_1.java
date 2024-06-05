package ㅅ_메서드_문제_1;

import java.util.Scanner;

public class Test18_1 {
    public static void main(String[] args) {

        test18(5,15);
    }

    public static void test18(int num1, int num2){
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        int count = 0;

        for (int i = min+1; i < max; i++){
            if (i % 5 == 0){
                count +=1;
            }
        }
        System.out.println("두 정수 사이 5의 배수의 개수 : " + count);
    }
}

