package ㄹ_IF_문제_2;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Test6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int max, mid, min;

        System.out.print("첫 번째 수 : ");
        a = sc.nextInt();

        System.out.print("두 번째 수 : ");
        b = sc.nextInt();

        System.out.print("세 번째 수 : ");
        c = sc.nextInt();

        //a가 가장 큰 수라면...
        if(a > b && a > c){
            max = a;
            if(b > c){ // a>b>c
                mid = b;
                min = c;
            }
            else { //a>c>b
                mid = c;
                min = b;
            }
        }
        //b가 가장 큰 수라면
        else if(b > a && b > c){
            max = b;
            if(a > c){ //b > a > c
                mid = a;
                min = c;
            }
            else{ // b > c > a
                mid = c;
                min = a;
            }
        }
        //c가 가장 큰 수라면
        else{
            max = c;
            if(a > b){ // c > a > b
                mid = a;
                min = b;
            }
            else { // c > b > a
                mid = b;
                min = a;
            }

        }
        System.out.println(max + " > " + mid + " > " + min);
    }
}
