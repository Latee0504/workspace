package list_test_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class {
    private List<Student> stuList;
    private String className;
    private String teacher;

    public List<Student> getStuList() {
        return stuList;
    }

    public Class(String className, String teacher, List<Student> stuList) {
        this.className = className;
        this.teacher = teacher;
        this.stuList = stuList;
    }

    public void printStu() { //해당 반의 모든 학생 정보 출력 메서드
        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i)); //그 반의 모든 학생 정보 출력
        }
    }
}