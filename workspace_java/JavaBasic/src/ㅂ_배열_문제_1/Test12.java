package ㅂ_배열_문제_1;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {

        double[] score = new double[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요 : ");
        score[0] = sc.nextDouble();
        System.out.println("영어 점수를 입력하세요 : ");
        score[1] = sc.nextDouble();
        System.out.println("수학 점수를 입력하세요 : ");
        score[2] = sc.nextDouble();
    }
}
