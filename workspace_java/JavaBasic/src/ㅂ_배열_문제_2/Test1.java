package ㅂ_배열_문제_2;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");

        int num = sc.nextInt();

        int[] arr1 = new int[num];
        int sum = 0;

        for (int i = 0; i< arr1.length; i++) {
            arr1[i] = i+1;
            sum += arr1[i];
        }
        float avg = sum / (float)num;
        System.out.println("평균 : " + avg);
    }
}
