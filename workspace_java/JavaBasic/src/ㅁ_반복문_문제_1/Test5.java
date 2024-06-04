package ㅁ_반복문_문제_1;

//while사용, 출력문 1회만 사용 2 4 6 8 10 출력

public class Test5 {
    public static void main(String[] args) {

        int j = 2;
        while(j< 11) {
            System.out.print(j + " ");
            j += 2;
        }

        System.out.println();

        int i = 1;

        while(i < 11){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}