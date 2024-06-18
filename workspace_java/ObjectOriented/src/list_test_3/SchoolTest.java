package list_test_3;

import class_basic.Stu_manage.Stu;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {

        Student stu1 = new Student("kim", 12, 80);
        Student stu2 = new Student("lee", 13, 85);
        Student stu3 = new Student("park", 11, 90);

        //자바반에 저장될 학생 리스트
        List<Student> stuList1 = new ArrayList<>();
        stuList1.add(stu1);
        stuList1.add(stu2);
        stuList1.add(stu3);

        //자바반
        Class javaclass = new Class("자바반", "강사_자바", stuList1);


        //캐드반에 저장될 학생 3명 생성
        Student stu4 = new Student("choi", 14, 85);
        Student stu5 = new Student("jung", 15, 65);
        Student stu6 = new Student("hyun", 16, 95);

        //캐드반에 학생들이 저장될 list생성 및 해당 list에 캐드반 학생 저장
        List<Student> stuList2 = new ArrayList<>();
        stuList2.add(stu4);
        stuList2.add(stu5);
        stuList2.add(stu6);

        //영상반 객체 생성 + 캐드반에 위에서 만든 캐드반 학생 목록 저장
        Class cadclass = new Class("캐드반", "강사_캐드", stuList2);


        //영상반에 저장될 학생 3명 생성
        Student stu7 = new Student("son", 17, 60);
        Student stu8 = new Student("cha", 18, 80);
        Student stu9 = new Student("gu", 19, 100);

        //영상반에 학생들이 저장될 list생성 및 해당 list에 캐드반 학생 저장
        List<Student> stuList3 = new ArrayList<>();

        //영상반 객체 생성 + 캐드반에 위에서 만든 캐드반 학생 목록 저장
        Class videoclass = new Class("영상반", "강사_영상", stuList3);
        stuList3.add(stu7);
        stuList3.add(stu8);
        stuList3.add(stu9);


        List<Class> classList = new ArrayList<>();
        classList.add(javaclass);
        classList.add(cadclass);
        classList.add(videoclass);

        School school = new School(classList);

        //학교 안 모든 학생의 정보 출력
        for (int i =0; i < school.getClassList().size(); i++){
            for (int j = 0; j < school.getClassList().get(i).getStuList().size(); j++){
                System.out.println();
            }
        }
    }
}
