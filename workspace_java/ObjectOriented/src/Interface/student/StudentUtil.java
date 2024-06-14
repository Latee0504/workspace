package Interface.student;

//1. 아래 요구에 맞는 추상메서드 정의
//2. 완성한 인터페이스를 구현한 클래스 생성(MyStudent)
//3. MyStudent 클래스에서 인터페이스의 메서드 구현
public interface StudentUtil {

    //첫 번째 메서드
    //메서드명 : getGradeByStudentName
    //첫 번째 매개변수로 받은 다수의 학생 중
    //두 번째 매개변수로 받은 이름을 가진 학생의 점수 등급을 리턴.
    //단, 전달받은 이름을 가진 학생이 없다면 점수 등급은 "등급 없음"이 된다.
    //평점 90이상 100이하 A, 10점 단위 내려가고 70미만 D등급
    String getGradeByStudentName(Student[] students, String name);

    //두 번째 메서드
    //메서드명 : getTotalScoresToArray
    //매개변수로 받은 다수의 학생들의 총점을 배열로 리턴

    int[] getTotalScoresToArray(Student[] students);

    //세 번째 메서드
    //메서드명 : getHighScoreStudent
    //매개변수로 두 명의 학생이 전달된다.
    //전달된 두 학생 중 총점이 높은 학생 객체를 리턴.
    //단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정.
    Student getHighScoreStudent(Student stu1, Student stu2);
}
