package ㅂ_배열_문제_3;

import java.sql.SQLOutput;

public class Test1 {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {1,5,3,8,2};

        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("max : "+ max);
    }
}
