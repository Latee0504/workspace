package list_test_1;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("홍길동");

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals("홍길동")){
                System.out.println("해당 이름이 존재합니다.");
            }
        }
    }
}
