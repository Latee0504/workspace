package ㅂ_배열;

//배열 (array)

public class 배열_1 {
    public static void main(String[] args) {
        // 정수 3개를 저장할 수 있는 배열 선언
        // 같은 자료형을 여러개 저장할 수 있음

        //배열 선언
        int[] arr1; //int[]와 int는 서로 다른 자료형
        String[] arr2;
        double[] arr3;

        //배열 초기화
        arr1 = new int[3]; //정수를 저장할 공간 3개를 생성.
        arr2 = new String[5]; //문자열을 저장할 공간 5개를 생성.
        arr3 = new double[10]; //실수를 저장할 공간 10개를 생성.

        //배열의 선언과 생성을 동시에
        //5개의 정수를 저장할 수 있는 배열 arr4를 생성
        int[] arr4 = new int[5];

        //실수를 2개 저장할 수 있는 배열 arr5를 생성
        double[] arr5 = new double[2];


        //arr1 배열을 출력
        //배열명을 출력하면 이상한 값이 출력된다.
        System.out.println(arr1);

        //

//        int a; //변수의 선언
//        a = 5; //변수의 초기화
//        a = 10; //변수의 초기화 아님
//        System.out.println(a);


    }
}
