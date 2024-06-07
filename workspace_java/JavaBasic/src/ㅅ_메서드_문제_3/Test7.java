package ㅅ_메서드_문제_3;

public class Test7 {
    public static void main(String[] args) {
        String[] array = {"java", "python", "C++"};
        test7(array);
    }
    public static String test7(String[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
}
