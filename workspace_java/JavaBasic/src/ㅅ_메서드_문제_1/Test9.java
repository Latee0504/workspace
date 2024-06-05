package ㅅ_메서드_문제_1;

public class Test9 {
    public static void main(String[] args) {
        info_name("김형진");
        info_age(33);
        info_addr("울산");
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