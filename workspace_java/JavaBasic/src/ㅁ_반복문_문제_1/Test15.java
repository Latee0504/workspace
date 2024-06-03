package ㅁ_반복문_문제_1;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i <= num){
            if(i % 2 == 0){
                count++;
            }
            i++;
        }
        System.out.println("1 부터 입력한 정수 까지의 짝수 개수 : " + count);
    }
}
