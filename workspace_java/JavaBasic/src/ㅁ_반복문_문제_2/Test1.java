package ㅁ_반복문_문제_2;

public class Test1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            if(i % 7 == 0){
                System.out.println(i);
            }
            else if(i % 9 == 0){
                System.out.println(i);
            }
        i++;
        }
    }
}
