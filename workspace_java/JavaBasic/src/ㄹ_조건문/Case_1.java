package ㄹ_조건문;

/*
    switch case break
    switch(변수){
        case 값1 :
        case 값2 :
        case 값3 :
    }
*/

public class Case_1 {
    public static void main(String[] args) {

        System.out.println("시작~");

        int num = 12; //실행의 시작지점
        //한 번 조건을 만족하면 그 밑의 모든 경우를 실행
        //break사용하여 막을 수 있음.
        switch(num){
            case 1 : //num값이 1일 때 실행 내용
                System.out.println(1);
                break;
            case 3 : //num값이 3일 때 실행 내용
                System.out.println(3);
                break;
            case 5 :
                System.out.println(5);
                break;
            case 7 :
                System.out.println(7);
                break;
            default: //그 밖에는 ~~
                System.out.println("해당 없음");
        }
        System.out.println("종료~");
    }

}
