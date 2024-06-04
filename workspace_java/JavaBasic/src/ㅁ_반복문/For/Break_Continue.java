package ㅁ_반복문.For;

public class Break_Continue {
    public static void main(String[] args) {
        //반복문(while, for)에서의 break 역할
        //break문을만나면 가장 가까이에 있는 반복문을 벗어난다.

        for (int i = 1; i < 11; i++){
            System.out.println(i);

            if (i == 5){
                break;
            }
        }

        System.out.println();

        //반복문에서 continue의 역할
        //반복문의 끝(다음 반복)으로 이동함.
        for (int i = 1; i < 11; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);

        }
    }
}
