package class_basic.Stu_manage;

import java.util.Scanner;

public class StuManage {
    private Scanner sc; //Scanner 멤버 변수의 선언 -> null로 초기화
    private Stu[] students; // 학생 다수를 저장할 배열
    private int idx; //학생 배열의 요소
    private String Stuname; //조회할 학생 이름
    private String newtel; //변경할 연락처

    //생성자
    public StuManage(){
        sc = new Scanner(System.in);
        students = new Stu[3];
        idx = 0;
        Stuname = null;
        newtel = null;
    }

    public void regStu(){
        if(idx >= 3){
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
        else{
            System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("학점 : ");
            String grade = sc.next();
            System.out.print("연락처 : ");
            String tel = sc.next();

            //입력받은정보로 학생 객체 생성
            Stu stu = new Stu(name, age, grade, tel);

            //생성한 학생 객체를 배열에 저장
            students[idx] = stu;
            idx++;
        }
    }
    public void editStu() {
        System.out.println("학생의 연락처를 변경합니다.");
        System.out.print("변경 학생 : ");
        Stuname = sc.next();
        for (int i = 0; i < idx; i++) { //배열 돌아다니면서
            if (Stuname.equals(students[i].getName())) { //배열 내의 이름과 맞다면
                System.out.print("연락처 : ");
                newtel = sc.next();
                students[i].setTel(newtel);
                System.out.println("변경완료되었습니다.");
            }
            else {
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요");
                editStu();
            }
        }
    }
    public void printStu(){
            System.out.print("정보를 열람할 학생 :");
            Stuname = sc.next(); //조회할 학생 이름 입력 받음

             for (int i = 0; i < idx; i++) { //배열 돌아다니면서
                 if (Stuname.equals(students[i].getName())) { //배열 내의 이름과 맞다면
                     System.out.println("요청하신 학생의 정보입니다.");
                     students[i].showInfo(); //이름이 같을 경우 정보 출력
                 }
                 else{
                     System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요");
                     printStu();
                 }
             }
        }
    public void printAll(){
        System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + idx + "명입니다.");
        for (int i = 0; i < idx; i++){
            students[i].showInfo();
        }
    }
}
