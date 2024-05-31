package ㄹ_IF_문제_2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max; //큰 수 저장
        int min; //작은 수 저장

        System.out.print("첫 번째 수 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 수 : ");
        int b = sc.nextInt();

        if(a > b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        System.out.println( max + " > " + min);
    }
}
