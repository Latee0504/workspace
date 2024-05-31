package ㄹ_조건문;

import java.util.Scanner;

public class IF_3 {
    public static void main(String[] args) {
        //키보드로 정수 하나를 입력받아,
        //입력받은 수가 양수이면 '1'
        //음수이면 '2'
        //0이면 '0' 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = sc.nextInt();

        if(a > 0){
            System.out.println(1);
        }
        else if(a < 0){
            System.out.println(2);
        }
        else{
            System.out.println(0);
        }
    }
}
