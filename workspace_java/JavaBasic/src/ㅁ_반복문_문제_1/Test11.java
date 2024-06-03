package ㅁ_반복문_문제_1;

public class Test11 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i<=100){
            if(i % 3 == 0){
                count += 1;
            }
            i++;
        }
        System.out.println("3의 배수의 개수 : " + count);
    }
}
