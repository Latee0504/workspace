package 상속;

public class SuperCls {
//    public SuperCls(int a){}
    public SuperCls(){
        System.out.println(111);
    }
    public SuperCls(String a, int b){

    }
}

//super를 위해 안 쓰는 생성자를 만들어야하는가?
//super에 맞는 매개변수를 넣어준다면
class SubCls extends SuperCls{
    public SubCls() {
//        super(5); //부모클래스의 생성자 중 int 하나를 매개변수로 받는 생성자 호출
        System.out.println(222);
    }
}