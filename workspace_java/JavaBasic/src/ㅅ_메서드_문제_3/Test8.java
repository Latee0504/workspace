package ㅅ_메서드_문제_3;

public class Test8 {
    public static void main(String[] args) {
        int[] num1 = {1,3,5,7};
        int[] num2 = {2,4,6,8};
        test8(num1,num2);
    }
    public static int[] test8(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            c[i+a.length] = b[i];
        }
        return c;
    }
}
