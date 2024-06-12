package 상속;

public class ManTest {
    public static void main(String[] args) {
        Businessman bm = new Businessman();
        System.out.println(bm.company);
        bm.tellCompany();

        System.out.println(bm.name);
        bm.tellName();
    }
}
