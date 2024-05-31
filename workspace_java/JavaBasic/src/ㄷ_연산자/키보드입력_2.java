package ㄷ_연산자;

import java.util.Scanner;

public class 키보드입력_2 {
    public static void main(String[] args) {

        //키보드 입력을 받을 수 있는 변수 생성
        Scanner sc = new Scanner(System.in);

        String r1 = sc.next();
        double r2 = sc.nextDouble();
        System.out.println("입력 받은 글 = " + r1);
        System.out.println("입력 받은 실수 = " + r2);

    }
}
