package ㅅ_메서드_문제_2;

public class Test5 {
    public static void main(String[] args) {
        test5(81);
    }
    public static String test5(int num){
        if(num >= 90){
            return "A";
        }
        else if(num >= 70){
            return "B";
        }
        else{
            return "C";
        }
    }
}
