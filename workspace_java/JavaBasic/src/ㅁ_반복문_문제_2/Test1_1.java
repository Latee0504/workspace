package ㅁ_반복문_문제_2;

public class Test1_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++){
            if (i % 7 == 0 || i % 9 == 0){
                System.out.println(i);
            }
        }
    }
}
