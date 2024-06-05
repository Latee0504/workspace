package ㅅ_메서드_문제_1;

public class Test10 {
    public static void main(String[] args) {
        String name = "김형진";
        int age = 33;
        String addr = "울산";
        info(name, age, addr);
    }
    public static void info(String name, int age, String addr) {
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "살입니다.");
        System.out.println("주소는 " + addr + "입니다.");
    }
}