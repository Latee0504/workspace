package ㅁ_반복문_문제_1;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i < num+1; i ++){
            if (i % 2 == 0){
                count += 1;
            }
        }
        System.out.print("짝수의 개수 : " + count);
    }
}
