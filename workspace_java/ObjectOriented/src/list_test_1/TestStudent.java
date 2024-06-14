package list_test_1;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student stu1 = new Student("A", 80, 90);
        Student stu2 = new Student("B", 90, 100);
        Student stu3 = new Student("C", 70, 70);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //9-1
        for (Student stu : list){
            System.out.println(stu);
        }

        System.out.println();
        //9-2
        System.out.println("150점이상 학생");
        for (Student stu : list){
            if (stu.getTotal()>= 150) {
                System.out.println(stu);
            }
        }

        System.out.println();

        //9-3
        System.out.println("각 학생 평균");
        double avg = 0;
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).avg());
        }

        System.out.println();

        //9-4
        System.out.println("1위 학생의 정보");
        Student first = new Student();
        for (int i = 0; i < list.size(); i++){
            if (first.avg() < list.get(i).avg()){
                first = list.get(i);
            }
        }
        System.out.println(first);
    }
}
