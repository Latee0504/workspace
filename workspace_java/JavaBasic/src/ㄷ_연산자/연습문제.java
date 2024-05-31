package ㄷ_연산자;

/*
키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다.
단, 점수들은 정수만 입력한다고 가정한다.
모든 정보를 입력받은 후
입력받은 이름, 국어점수, 영어점수, 수학점수와 총점 및 평균을 출력
*/

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {
        //키보드 입력을 받을 수 있는 변수 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 :");
        String name = sc.next();

        System.out.print("국어 점수를 입력하세요 :");
        float lan = sc.nextInt();

        System.out.print("영어 점수를 입력하세요 :");
        float eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 :");
        float math = sc.nextInt();

        float total = lan + eng + math;
        double avg;

        avg = total / 3.0;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + lan + "점");
        System.out.println("영어 : " + eng + "점");
        System.out.println("수학 : " + math + "점");

        System.out.println("이름 : " + name);
        System.out.println("총점 : " + total + ", 평균 : " + avg);
    }
}
