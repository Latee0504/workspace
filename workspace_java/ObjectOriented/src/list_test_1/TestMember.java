package list_test_1;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();

        Member mem1 = new Member("java", "01", "kim", 10);
        Member mem2 = new Member("B", "02", "lee", 20);
        Member mem3 = new Member("C", "03", "park", 30);

        list.add(mem1);
        list.add(mem2);
        list.add(mem3);

        //6번
        for (Member member : list){
            System.out.println(member);
        }
        System.out.println();

        //7번
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i).getAge();
        }
        System.out.println("나이의 합 : " + sum);
        System.out.println();

        //8번
        //list.remove();

        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals("java")){
                list.remove(i);
            }
            System.out.println(list.get(i));
        }

    }
}
