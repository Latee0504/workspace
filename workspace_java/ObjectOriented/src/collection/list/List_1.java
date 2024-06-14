package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static void main(String[] args) {
        //ArrayList 객체 생성
        //String 데이터를 다수 저장하기 위한 list(통) 생성
        //기본자료형 사용 불가 -> wrapper클래스 사용
        //ArrayList<String> list1 = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        //리스트에 데이터 저장하기
        list1.add("java");
        list1.add("c++");
        list1.add("python");
        list1.add("c++");

        //리스트에 저장된 데이터 읽기
        //List는 중복된 데이터가 있을 수 있으므로 순번으로 접근한다.
        String result = list1.get(1); //(첫 번째) c++

        //리스트에 저장된 데이터 삭제
        list1.remove(0);// java 삭제

        //리스트에 저장된 데이터 수
        System.out.println(list1.size());

        //리스트에 저장된 모든 데이터 출력
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
//        System.out.println(list1);

        //정수데이터를 다수 저장하기 위한 list(통) 생성
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);

    }
}
