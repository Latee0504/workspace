package ㅂ_배열_문제_2;

public class Test8_1 {
    public static void main(String[] args) {
        int arr[] = new int[6];

        for (int i = 0; i < arr.length; i++) { //length 길이만큼 i반복
            int num = (int) (Math.random() * 45 + 1); //범위는 1~45이다
            arr[i] = num; //arr[i]에 값 넣는다.

            //중복 제외
            for (int j = i; j < arr.length; j++) { //length 길이만큼 j반복
                while (arr[i] == arr[j]) {//arr[i]값이 다른 모든 값(arr[0]~arr[j]과 같다면 *arr[0]과 [0]이 같아서 문제
                    arr[i] = num; //arr[i] 랜덤값 넣기
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}


