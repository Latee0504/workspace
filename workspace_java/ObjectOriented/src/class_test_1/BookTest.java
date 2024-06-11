package class_test_1;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("java", "kim", 1000);

        Book book2 = new Book("python", "lee", 2000);

        //자료형 변수명
        Book book3 = book1;
        System.out.println(book1.title);
        System.out.println(book3.title);
        book1.title = "c++";
        System.out.println(book1.title); // c++
        System.out.println(book3.title); // c++
        //기본 자료형과 달리 참조자료형으로써 '저장된 메모리 주소'를 찾아가기에 book3의 값도 변한다


        //기본자료형
        int num = 5;
        int num2 = num; //num2에 num값(5)을 집어넣는다
        double num3 = num2; //자동형변환(promotion)
//        double num4 = 5.5;
//        int num5 = num4;


    }
}
