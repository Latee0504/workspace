package collection.list;

import java.util.ArrayList;
import java.util.List;

public class list_2 {
    public static void main(String[] args) {
        //정수를 다수 저장할 수 있는 list 생성
        List<Integer> list2 = new ArrayList<>();

        list2.add(5);
        list2.add(15);
        list2.add(25);

        int result = list2.get(1); //15
    }
}
