package list_test_1;

import Stataic.InitTest;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int rand = (int)(Math.random()*100);
            list.add(rand);
//            if (list.get(i) % 2 == 0){
//                System.out.println(list.get(i));
//            }
        }
        int count = 0;
        for (int e : list){
            if (e % 2 == 0) {
                count++;
                System.out.println(e);
            }
        }
        System.out.println("count : " +count);
    }
}
