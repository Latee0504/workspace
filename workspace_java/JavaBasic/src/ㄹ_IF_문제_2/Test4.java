package ㄹ_IF_문제_2;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("국어 점수를 입력하세요 : ");
        int kor = sc.nextInt();

        System.out.println("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();

        System.out.println("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();

        int total = kor + eng + math;
        double avg = total / 3.0;
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
    }
}
