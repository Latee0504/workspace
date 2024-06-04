package ㅁ_반복문_문제_1;
//1~100까지 숫자 중 3의 배수인 수의 개수를 while문을 사용하여 출력하라.
public class Test11 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i < 101){
            if(i % 3 == 0){
                count += 1;
            }
            i++;
        }
        System.out.println("3의 배수의 개수 : " + count);
    }
}