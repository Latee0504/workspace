package ㅅ_메서드_문제_3;

public class Test1 {
    public static void main(String[] args) {
        test2(2);
    }

    public static void test2(int a){
        for (int i = 1; i <10; i++){
            String result = a + " X " + i + " = " + a * i;
            System.out.println(result);
        }

    }
}