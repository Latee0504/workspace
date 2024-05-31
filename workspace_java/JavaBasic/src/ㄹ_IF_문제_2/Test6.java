package ㄹ_IF_문제_2;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요  : ");
        int a = sc.nextInt();

        System.out.println("두 번째 정수를 입력하세요  : ");
        int b = sc.nextInt();

        System.out.println("세 번째 정수를 입력하세요  : ");
        int c = sc.nextInt();

        if(a > b && a > c && b > c){
            System.out.println(a + " > " + b + " > " + c);
        }
        else if(a > b && a > c && c > b){
            System.out.println(a + " > " + c + " > " + b);
        }
        else if(b > a && b > c && a > c){
            System.out.println(b + " > " + a + " > " + c);
        }
        else if(b>  a && b > c && c > a){
            System.out.println(b + " > " + c + " > " + a);
        }
        else if(c>  a && c > b && a > b){
            System.out.println(c + " > " + a + " > " + b);
        }
        else {
            System.out.println(c + " > " + b + " > " + a);
        }
    }
}
