package ㅂ_배열_문제_2;

import java.util.TreeMap;

public class Test8 {
    public static void main(String[] args) {
        int arr[] = new int[6];

        for (int i = 0; i<arr.length; i++){
            int num = (int)(Math.random()*45 + 1);
            arr[i] = num;
            System.out.print(arr[i] + " ");
        }
    }
}
