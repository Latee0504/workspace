package ㅁ_반복문_문제_1;

public class Test9 {
    public static void main(String[] args) {

        int i = 1;
        int total = 0;

        while (i < 11){
            total += i;
            i++;
        }
        System.out.println("합계 : " + total);
    }
}