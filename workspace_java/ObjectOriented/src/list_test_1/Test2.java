package list_test_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.print(i+1 + "번째 정수를 입력하세요 : ");
            int num = sc.nextInt();
            list.add(num);
        }

//        System.out.print("첫번째 정수를 입력하세요 : ");
//        int a = sc.nextInt();
//        list.add(a);
//        System.out.print("두번째 정수를 입력하세요 : ");
//        int b = sc.nextInt();
//        list.add(b);
//        System.out.print("세번째 정수를 입력하세요 : ");
//        int c = sc.nextInt();
//        list.add(c);
//        System.out.print("네번째 정수를 입력하세요 : ");
//        int d = sc.nextInt();
//        list.add(d);
//        System.out.print("다섯번째 정수를 입력하세요 : ");
//        int e = sc.nextInt();
//        list.add(e);

        int sum = 0;

//        for (int i = 0; i < list.size(); i++){
//
//            sum += list.get(i);
//        }
        for(int e : list){
            sum += e;
        }
        System.out.println(sum);
    }
}
