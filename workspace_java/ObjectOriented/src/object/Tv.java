package object;

import class_basic.Monitor;
import 상속.MobilePhone;

//클래스가 상속을 받고있지 않다면, 자동으로 Object라는 클래스를 상속 받는다.
//모든 클래스는 Object 클래스를 상속 받는다. (상속받지 않는 부모 클래스는 Object를 기본적으로 받기에)
public class Tv { //extends Object
    String modelName;

    public void powerOn(){
        System.out.println("전원을 켭니다.");
        aaa(5);

        Monitor mm = new Monitor();
        bbb(mm);

        //
        ccc(mm);
    }

    public void bbb(Monitor m){

    }

    public void ccc(Object obj){ //Object obj = mm;

    }

    public void aaa(int a){

    }



}

class LgTv extends Tv{

}