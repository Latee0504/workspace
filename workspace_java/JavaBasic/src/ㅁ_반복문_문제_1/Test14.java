package ㅁ_반복문_문제_1;

public class Test14 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 101; i++){
            if (i % 5 == 0){
                count += 1;
                System.out.println(i);
            }
        }
        System.out.println("5의 배수의 개수 : " + count);
    }
}