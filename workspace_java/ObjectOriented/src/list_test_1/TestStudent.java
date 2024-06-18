package list_test_1;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {

        Student stu1 = new Student("A", 80, 90);
        Student stu2 = new Student("B", 90, 100);
        Student stu3 = new Student("C", 70, 70);

        List<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //9-1 리스트에 저장된 모든 정보 출력
        for (Student stu : list){
            System.out.println(stu);
        }

        System.out.println();
        //9-2 총점이 150점 이상인 학생의 모든 정보를 출력
        System.out.println("150점이상 학생");
        for (Student stu : list){
            if (stu.getTotal()>= 150) {
                System.out.println(stu); //객체를 출력문에 넣으면 toString 자동으로 적용.
            }
        }

        System.out.println();

        //9-3 모든 학생 각각에 대한 평균 점수를 출력
        System.out.println("각 학생 평균");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).avg());
        }

        //9-3 모든 학생에 대한 평균 점수를 출력
        System.out.println("학생 총점 평균");
        int sum = 0;
        for (Student stu : list){
            sum = sum + stu.getTotal();
        }
        System.out.println((double)sum / list.size());

        System.out.println();

        //9-4 총점이 1등인 학생의 모든 정보를 출력(직접)
        System.out.println("1위 학생의 정보");
        Student first = new Student();
        for (int i = 0; i < list.size(); i++){
            if (first.getTotal() < list.get(i).getTotal()){
                first = list.get(i);
            }
        }
        System.out.println(first);

        //9-4.1 해법
        int index = 0; //총점이 1등인 학생의 index
        int max = 0; //가장 높은 총점
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).getTotal()) {
                max = list.get(i).getTotal();
                index = i;
            }
        }
        System.out.println(list.get(index));
    }
}
