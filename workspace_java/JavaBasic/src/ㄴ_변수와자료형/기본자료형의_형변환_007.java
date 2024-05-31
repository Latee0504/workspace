package ㄴ_변수와자료형;

public class 기본자료형의_형변환_007 {
    public static void main(String[] args) {

        //정수는 실수에 저장 가능
        //자동 형변환(promotion)
        int n1 = 10;
        double n2 = n1;
        System.out.println(n2);

        //강제 형변환(Casting)
        double n3 = 5.5;
        // int n4 = n3; 실수는 정수형에 저장 불가
        int n4 = (int)n3; // 실수 데이터 n3를 int자료형으로 강제 형변환
        System.out.println(n4);

    }
}
