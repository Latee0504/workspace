package 상속.Test;

public class Test7 {
}



class A1{

    private int n;

    public int getN() {
        return n;
    }
    public void setN(int i){
        n = i;
    }
}

class B1 extends A1{

    public String s;
    public int m;
    private char c;

    public void setC(char ch){
        c = ch;
    }
    public char getC(){
        return c;
    }
}

class C1 extends B1{
    private double d;
}
