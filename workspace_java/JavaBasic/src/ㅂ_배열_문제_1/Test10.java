package ㅂ_배열_문제_1;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] arr1 = new int[5];

        for (int i = 0; i< arr1.length; i++){
            System.out.print(i+1 + "번째 정수를 입력하세요 : ");
            arr1[i] = sc.nextInt();
            }
        for (int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for (int e : arr1){
            System.out.print(e + " ");
        }
    }
}
