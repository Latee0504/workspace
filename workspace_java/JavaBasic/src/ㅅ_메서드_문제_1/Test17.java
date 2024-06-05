package ㅅ_메서드_문제_1;

public class Test17 {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        test17(a,b);
    }
    public static void test17(int num1, int num2){
        int max;
        int min;

        if (num1 > num2){
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }
        while (min < max){
            min++;
            if(max == min){
                break;
            }
            System.out.println(min);
        }
    }
}