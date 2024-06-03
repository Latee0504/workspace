package ㅁ_반복문_문제_1;

public class Test13 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i <= 100){
            if(i % 5 == 0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("5의 배수의 갯수 : " + count);
    }
}
