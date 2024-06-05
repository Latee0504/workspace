package ㅅ_메서드_문제_1;

import java.util.Scanner;

public class Test12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : " );
        String name = sc.next();
        System.out.print("나이를 입력하세요 : " );
        int age = sc.nextInt();
        System.out.print("주소를 입력하세요 : " );
        String addr = sc.next();

        info(name, age, addr);
    }
    public static void info(String name, int age, String addr) {
        info_name(name);
        info_age(age);
        info_addr(addr);
    }
    public static void info_name(String name){
        System.out.println("이름은 " + name + "입니다.");
    }
    public static void info_age(int age){
        System.out.println("나이는 " + age + "살입니다.");
    }
    public static void info_addr(String addr){
        System.out.println("주소는 " + addr + "입니다.");
    }
}
