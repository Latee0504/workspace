package ㅁ_반복문.While;
//10~0까지 출력
public class While_3 {
    public static void main(String[] args) {
//     int i = 10;
//     while (i >=0){
//         System.out.println(i);
//         i -= 1;
//     }

     //1~20까지의 수 중 홀수만 출력
        int j = 1;
        while(j <= 20 ){
            if(j % 2 == 1){
            System.out.println(j);
            }
        j++;
        }
    }
}

