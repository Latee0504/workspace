package ㅂ_배열_문제_1;

public class Test11 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int count = 0;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] %2 == 0){
                count += 1;
            }
        }
        System.out.println("배열 내의 짝수의 개수 :" + count);
    }
}
