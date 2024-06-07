package ㅅ_메서드_문제_3;

public class Test6 {
    public static void main(String[] args) {
        int[] array = {1,3,8,7};
    }
    public static int test6(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
