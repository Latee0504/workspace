package ㅂ_배열_문제_2;

public class Test6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++){
            newArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++){
            newArr[j + arr1.length] = arr2[j];
        }
        for(int k = 0; k < newArr.length; k++){
            System.out.print(newArr[k] + " ");
        }
    }
}
