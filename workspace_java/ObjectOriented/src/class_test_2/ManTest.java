package class_test_2;

public class ManTest {
    public static void main(String[] args) {
        Man man = new Man("홍", 20, "울산");

        //이름 변경
        //man.name = "kim";
        man.setName("kim");

        System.out.println(man.getName());
    }
}
