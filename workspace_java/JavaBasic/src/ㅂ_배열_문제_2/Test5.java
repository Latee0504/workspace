package ㅂ_배열_문제_2;

/*
초기값을 5,4,3,2,1로 갖는 배열 arr을 만들자.
그리고 길이가 5인 새로운 정수형 배열 newArr을 만든 후 arr이 가진 값을
newArr로 복사하여 보자. 복사 결과는 출력을 통해 확인한다.
*/

public class Test5 {
    public static void main(String[] args) {

        int[] arr1 = {5, 4, 3, 2, 1};
        int[] newArr = new int[5];

        for (int i = 0; i<arr1.length; i++){
            newArr[i] = arr1[i];
            System.out.print(newArr[i] + " ");
        }
    }
}