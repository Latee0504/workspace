package ㄹ_IF_문제_1;

public class Test5 {
    public static void main(String[] args) {
        int a = 79;
        String grade;

        if (a <= 100 && a > 90){
//            System.out.println("학점은 A입니다.");
            grade = "A";

        }
        else if (a > 80){
//            System.out.println("학점은 B입니다.");
            grade = "B";
        }
        else {
//            System.out.println("학점은 C입니다.");
            grade = "C";
        }
        System.out.println("학점은 " + grade + "입니다.");
    }
}
