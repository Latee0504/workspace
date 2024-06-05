package ㅂ_배열_문제_1;

import java.util.Scanner;

public class Test12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //0 : 국어, 1 : 영어 , 2 : 수학, 마지막 : 총점
        int scores[] = new int[6];
        //과목명
        String[] subjects = {"국어","영어","수학", "사회", "과학"};
        //평균
        double avg;

        //점수입력(0~100점 입력 될 때까지 무한 입력)
        for (int i = 0; i < (scores.length-1); i++){
            while(true){
                System.out.println(subjects[i] + "점수를 입력하세요 : ");
                scores[i] = sc.nextInt();

                if (scores[i] >= 0 && scores[i] <= 100){
                    break;
                }
            }
        }
        //총점 및 평균 계산
        for (int i = 0; i < (scores.length-1); i ++){
            scores[scores.length-1] += scores[i];
        }
        avg =(scores[scores.length-1] / (double)(scores.length-1));

        //점수, 총점, 평균 출력
        //과목 점수 출력
        System.out.println("------------");
        for (int i = 0; i<subjects.length; i++){
            System.out.println(subjects[i] + "점수 - " + scores[i]);
        }

        //총점 출력
        System.out.println("총점 - " + scores[scores.length-1]);
        System.out.println("평균 - " + avg);
    }
}


