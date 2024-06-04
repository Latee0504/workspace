package ㅁ_반복문_문제_1;
//1~100의 5의 배수를 출력하고 그 개수도 출력하라. while문 사용
public class Test13 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i < 101){
            if(i % 5 == 0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("5의 배수의 갯수 : " + count);
    }
}
