package ㅁ_반복문_문제_2;

public class Test3 {
    public static void main(String[] args) {

        int i = 0;
        int total = 0;
        
        for(i = 1; i>0; i++){
            total += i;
            if (total >300){
                break;
            }
        }
        System.out.println("합계 :" + total);
        System.out.println("마지막으로 더해진 값 : " + (i));
    }
}
