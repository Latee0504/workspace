package list_test_3;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Class> classList;

    public School(List<Class> classList){
        this.classList = classList;
    }


    public List<Class> getClassList(){
        return classList;
    }

//    public void classInfo(String teacher){
//        for (Class c : classList){
//            if (teacher.equals(c.getTeacher())){ //매개변수로 받은 teacher가 해당 반의 teacher와 일치하다면
//                System.out.println(c.printStu()); //해당 반의 학생을 모두 출력
            }
//        }
//    }
//}
