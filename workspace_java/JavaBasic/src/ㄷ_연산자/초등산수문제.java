package ㄷ_연산자;

//534자루의 연필을 30명의 학생들에게 똑같이 나누어 주었을 때
//학생당 몇 개의 연필을 가질 수 있고, 몇개의 연필이 남게 되는가?

public class 초등산수문제 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int Per = pencils / students;
        System.out.print(Per + "개의 연필을 가지고 ");

        int left = pencils % students;
        System.out.println(left + "개의 연필이 남는다.");
    }
}
