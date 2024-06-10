package class_test_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        Scanner sc =new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 수 : ");
        int num2 = sc.nextInt();

        System.out.print("연산자 : ");
        String oper = sc.next();

        //cal 객체의 num1과 num2값을 키보드로 입력받은 값으로 변경
        cal.setNum1(num1);
        cal.setNum2(num2);

        if (oper.equals("+")){
            System.out.println(num1 + oper + num2 + " = " + cal.getSum());
        }
        else if (oper.equals("-")){
            System.out.println(num1 + oper + num2 + " = " + cal.getSub());
        }
        else if (oper.equals("*")){
            System.out.println(num1 + oper + num2 + " = " + cal.getMulti());
        }
        else if (oper.equals("/")){
            System.out.println(num1 + oper + num2 + " = " + cal.getDiv());
        }
        else{
            System.out.println("연산자 입력 오류.");
        }
    }
}
