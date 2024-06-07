package ㅅ_메서드_문제_2;

public class Test9 {
    public static void main(String[] args) {
        test9(12);
    }
    public static int test9(int a){
        int sum = 0;
        for(int i =1; i <= a; i++){
            if (i % 2 == 1)
                sum += i;
        }
        return sum;
    }
}