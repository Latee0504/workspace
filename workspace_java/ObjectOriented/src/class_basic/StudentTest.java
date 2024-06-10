package class_basic;

public class StudentTest {
    public static void main(String[] args) {
        //학생객체 stu1 생성
        Student stu1 = new Student();

        //이름 출력
        System.out.println(stu1.name);

        //학생의 모든 정보 출력
        stu1.introduce();
        stu1.setName("K");
        System.out.println();
        stu1.introduce();

//        stu1.age = 30;
//        stu1.introduce();
        stu1.setAge(40);
        stu1.introduce();
    }
}
