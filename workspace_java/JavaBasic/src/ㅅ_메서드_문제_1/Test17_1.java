package ㅅ_메서드_문제_1;

public class Test17_1 {
    public static void main(String[] args) {

        test17(5, 9);
    }
    public static void test17(int num1, int num2){
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;


        while (min < max){
            min++; //for(int i = min + 1; i < max; i++){}
            if(max == min){
                break;
            }
            System.out.println(min);
        }
    }
}