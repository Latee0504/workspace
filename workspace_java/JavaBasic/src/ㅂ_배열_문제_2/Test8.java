package ㅂ_배열_문제_2;

import java.util.Arrays;
import java.util.TreeMap;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*45 + 1);

        }
        System.out.print(Arrays.toString(arr));
    }
}
