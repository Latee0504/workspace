package Interface.student;

public class MyStudent implements StudentUtil {
    //첫 번째 메서드
    //메서드명 : getGradeByStudentName
    //첫 번째 매개변수로 받은 다수의 학생 중
    //두 번째 매개변수로 받은 이름을 가진 학생의 점수 등급을 리턴.
    //단, 전달받은 이름을 가진 학생이 없다면 점수 등급은 "등급 없음"이 된다.
    //평점 90이상 100이하 A, 10점 단위 내려가고 70미만 D등급
    @Override
    public String getGradeByStudentName(Student[]students, String name) {
        String grade = "등급없음";
        for (Student stu : students){
            if (stu.getName().equals(name)){
                double avg = (stu.getKorScore() + stu.getEngScore() + stu.getMathScore()) / 3.0;
                grade = getGradeByAvg(avg);
            }
        }
        return grade;
    }

    //점수에 따라 등급 결정
    private String getGradeByAvg(double avg){
        String grade = "등급없음";
        if(avg >= 90 && avg <= 100){
            grade = "A";
        }
        else if(avg >= 80){
            grade = "B";
        }
        else if(avg >= 70) {
            grade = "C";
        }
        else {
            grade = "D";
        }
        return grade;
    }


    //두 번째 메서드
    //메서드명 : getTotalScoresToArray
    //매개변수로 받은 다수의 학생들의 총점을 배열로 리턴



    @Override
    public int[] getTotalScoresToArray(Student[] students) {
        //학생들의 총점이 저장될 배열 생성
        int[] totalScores = new int [students.length];

        for(int i = 0; i<students.length; i++){
            totalScores[i] = students[i].getKorScore() + students[i].getMathScore() + students[i].getEngScore();
        }

        return totalScores;
    }
    //세 번째 메서드
    //메서드명 : getHighScoreStudent
    //매개변수로 두 명의 학생이 전달된다.
    //전달된 두 학생 중 총점이 높은 학생 객체를 리턴.
    //단, 전달된 두 학생의 총점이 같은 경우는 없다고 가정.
    @Override
    public Student getHighScoreStudent(Student stu1, Student stu2) {
        int sum1 = stu1.getEngScore() + stu1.getKorScore() + stu1.getMathScore();
        int sum2 = stu2.getEngScore() + stu2.getKorScore() + stu2.getMathScore();

        return sum1 > sum2 ? stu1 : stu2;
    }
}

