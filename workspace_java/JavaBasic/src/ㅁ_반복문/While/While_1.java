package ㅁ_반복문.While;

/*
    while(조건){ //조건이 참이면 거짓이 될 때까지 반복실행
        (반복적으로 실행되는 내용)
    }
*/

public class While_1 {
    public static void main(String[] args) {

        int i = 1;

        while(i <= 3){ //반복조건
            System.out.println(1); //반복실행할 내용
            i+=1; //반복을 파기할 조건
        }
    }
}