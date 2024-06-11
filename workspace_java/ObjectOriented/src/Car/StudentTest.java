package Car;


//배열 + 클래스
public class StudentTest {
    public static void main(String[] args) {
        //학생을 5명 저장할 수 있는 배열 생성
        Student[] students = new Student[5]; //참조자료형 -> 배열 안에 다 null 들어가 있음

        //배열에 저장할 학생 객체 생성
        Student s1 = new Student("kim", 20, 80);
        Student s2 = new Student("lee", 22, 70);
        Student s3 = new Student("choi", 25, 50);
        Student s4 = new Student("park", 28, 90);
        Student s5 = new Student("jung", 30, 88);


        //배열 0번째 요소에 학생 s1 저장
        students[0] = s1; //Student 클래스 라는 자료형을 받음
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        //1. 배열에 저장된 모든 학생의 이름, 나이, 점수를 출력
//        for(int i = 0; i < students.length; i++){
//            students[i].printStu();
//            System.out.println();
//        }
        //1번문제를 for-each문으로 해결
//        for(Student e : students) {
//            e.printStu();
//            System.out.println();
//        }

        //2. 배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
//        for(int i = 0; i < students.length; i++){
//            if (students[i].getScore() >= 80){
//                students[i].printStu();
//            }
//        3. 이름이 'park'인 학생을 찾아 해당 학생의 나이를 10으로 변경
//        for과 for-each 방식 두 개로 풀이
//        for (int i = 0; i < students.length; i++){
//            if (students[i].getName().equals("park")){
//                students[i].setAge(10);
//                students[i].printStu();
//            }
//        }
        for(Student e : students){
            if (e.getName().equals("park")){
                e.setAge(10);
                e.printStu();
            }
        }

    }
}