package ㄹ_조건문;

import java.util.Scanner;

/*
    점수(정수)를 키보드로 입력 받는다.
    입력받은 점수가 90점 이상, 100점 이하면 A
    80점 이상 90점 미만이면 B
    70점 이상 80점 미만이면 C
    70점 미만은 D를 출력
*/
public class Switch_예제_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 :");

        int score = sc.nextInt();


        switch(score / 10){
            case 9, 10:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            default:
                System.out.println('D');
        }
    }
}
