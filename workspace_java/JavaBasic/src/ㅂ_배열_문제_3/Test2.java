package ㅂ_배열_문제_3;

public class Test2 {
    public static void main(String[] args) {
        int[] arr= new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*99 + 1);
            System.out.print(arr[i] + " ");
        }
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println();

        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);

    }
}
