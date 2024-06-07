package ㅅ_메서드;

import java.security.PublicKey;

public class 메서드_5 {
    public static void main(String[] args) {
        double result = getSum(10, 20);
        System.out.println(result);

        System.out.println(getSum(20,40));
    }

    //매개변수로 전달된 두 정수의 합을 실수형태로 리턴하는 메서드
    public static double getSum(int a, int b){
        //return할 자료형이 int이므로 void가 아닌 int 사용
        return a + (double)b;
        //'return' 키워드는 항상 메서드의 마지막에 딱 한 번만 실행 가능
//        println("adsfsfd")
    }   

}
