package ㄹ_IF_문제_3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x좌표를 입력하세요 :");
        int x = sc.nextInt();
        System.out.println("y좌표를 입력하세요 :");
        int y = sc.nextInt();

        if (x >= 50 && x <= 100 && y >= 50 && y <= 100) {
            System.out.println("(" + x + "," + y + ") 는 사각형 안에 있습니다.");
        } else {
            System.out.println("(" + x + "," + y + ") 는 사각형 안에 없습니다.");
        }
    }
}
