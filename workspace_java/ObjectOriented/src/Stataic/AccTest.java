package Stataic;

public class AccTest {
    public static void main(String[] args) {

        //1만명.
        Account a1 = new Account("1111", 10000);
        Account a2 = new Account("1112", 100000);
        Account a3 = new Account("1113", 50000);
        Account a4 = new Account("1114", 30000);
        Account a5 = new Account("1115", 70000);

        //a1.iyul = 10.0, a2.iyul = 10.0 , a3.... ?  -> static사용

        System.out.println(a1);
        Account.iyul = 10.0;
        System.out.println(a1);
    }
}
