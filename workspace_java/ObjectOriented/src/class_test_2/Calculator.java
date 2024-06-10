package class_test_2;

public class Calculator {
    private int num1;  //0
    private int num2;

    //num1과 num2값을 변경하는 메서드
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum(){
        return num1 + num2;
    }
    public int getSub(){
        return num1 - num2;
    }
    public int getMulti(){
        return num1 * num2;
    }
    public double getDiv(){
        return num1 / (double)num2;
    }

//    public void printSum(){
//        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
