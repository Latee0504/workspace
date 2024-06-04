package ㅁ_반복문.For;

public class For_1 {
    public static void main(String[] args) {
//        int i = 1;
//        while (i < 11){
//            System.out.println(i);
//            i++;
//        }
//
//        for(int i = 1; i<10; i++){
//            System.out.println(i);
//        }

        int total = 0;
        //for 문을 이용하여 1~10까지 합을 구하시오
        for (int i = 1; i < 11; i++){
            total += i;
        }
        System.out.println("합계 : " + total);
    }
}