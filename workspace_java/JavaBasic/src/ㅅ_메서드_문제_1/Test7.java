package ㅅ_메서드_문제_1;

public class Test7 {
    public static void main(String[] args) {
        test7(6, 17);
    }
    public static void test7(int a,int b){
        int max;
        int min;
        if (a > b){
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        System.out.println("두 수의 몫 : " + max / min);
        System.out.println("두 수의 나머지 : " + max % min);
    }
}
