package class_basic.Stu_manage;

public class Stu {
    private String name;
    private int age;
    private String grade;
    private String tel;

    public Stu(String name, int age, String grade, String tel) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.tel = tel;
    }
    //2, 3번 이름 비교를 위한 getter
    public String getName() {
        return name;
    }

    //2번 연락처 변경을 위한 setter
    public void setTel(String tel) {
        this.tel = tel;
    }

    //학생의 모든 정보 출력
    public void showInfo(){
        System.out.println(" 이름: " + name);
        System.out.println(" 나이: " + age);
        System.out.println(" 학점: " + grade);
        System.out.println(" 연락처: " + tel);
    }

}
