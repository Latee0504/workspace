package ㅂ_배열;
//배열 뿐만 아니라 모든 참조 자료형이 이렇다.
public class 배열과기본자료형의차이 {
    public static void main(String[] args) {

        int[] a = {1,3,5};
        int[] b = a;
        a[0] = 10;
        b[2] = 50;

        for (int e : a){
            System.out.println(e + " "); //10 3 5
        }

        System.out.println();

        for (int e : b){
            System.out.println(e + " "); // 1 3 5 xxxxxx 10 3 5
        }
        //참조 자료형은 변수에 데이터가 저장된 위치를 저장.
        //저장된 데이터가 바뀔 경우 위치는 바뀌지 않기에 복사할 경우 데이터의 위치를 공유하게 된다.
        //즉, 변수의 데이터 값이 각각 바뀔 경우 같은 주소에 있는 모든 변수의 데이터가 바뀐다.

        System.out.println();

        //배열의 복사
        int [] c = {1,2,3};
        int [] d = c.clone(); //c에 있는 데이터를 복사.
        d[1] = 3;

        for (int e : d){
            System.out.print(e + " ");
        }
    }
}