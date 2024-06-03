package ㄹ_조건문;
/*
    주민등록번호의 7번째 자리는 성별을 나타낸다.
    키보드로 주민등록번호 7번째 자리를 입력 받아
    7번째 자리의 수가 1,3이면 남성을 출력
    7번째 자리의 수가 2,4이면 여성을 출력
    나머지의 경우 '오류'를 출력
*/

import java.util.Scanner;

public class Switch_예제_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호 7번째 자리 수를 입력하세요 : ");
        int num = sc.nextInt();

        switch (num){
            case 1:
            case 3:
                System.out.println("남성");
                break;
            case 2:
            case 4:
                System.out.println("여성");
                break;
            default:
                System.out.println("오류");
        }
    }
}