package ㅅ_메서드_문제_3;

public class Test9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        test9(arr);
    }
    public static int[] test9(int[] arr){
//        int[] b = new int[a.length]; 짝수의 개수만큼 배열의 크기 설정
//        for (int i = 0; i < a.length; i++){
//
//            if (a[i] % 2 == 0){ // 0이 나오는 구간 발생
//                b[i] = a[i];
//            }
//            else{
//            }
//        }

//        return b;
        int count = 0;
        for(int e : arr){
            if(e % 2 == 0){
                count += 1;
            }
        }
        int[] resultArr = new int[count]; //짝수의 개수만큼 배열크기 설정

        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                resultArr[index] = arr[i];
                index++;
            }
        }
        return resultArr;
    }
}
