package Interface.student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyStudent s = new MyStudent();

        Student[] students = new Student[5];
        Student s1 = new Student("kim",80,70,90);
        Student s2 = new Student("lee",50,70,60);
        Student s3 = new Student("park",80,70,70);
        Student s4 = new Student("choi",100,90,90);
        Student s5 = new Student("jung",40,80,90);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        String result1 = s.getGradeByStudentName(students, "kim");
        System.out.println(result1);

        System.out.println();

        int[] result2 = s.getTotalScoresToArray(students);
        System.out.println(Arrays.toString(result2));

        System.out.println();

        Student stu = s.getHighScoreStudent(s2,s3);
        System.out.println(stu.getName());
    }
}
