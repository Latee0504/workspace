package ㅁ_반복문_문제_1;
//임의의 정수 입력, 1~입력 받은 수까지 중 짝수의 개수 구하라, while문 사용
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i < num+1){
            if(i % 2 == 0){ // print i/2
                count++;
            }
            i++;
        }
        System.out.println("1 부터 입력한 정수 까지의 짝수 개수 : " + count);
    }
}