package ㅂ_배열_문제_2;

public class Test5 {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] newArr = new int[5];
        newArr = arr1;

        for (int i = 0; i<arr1.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
