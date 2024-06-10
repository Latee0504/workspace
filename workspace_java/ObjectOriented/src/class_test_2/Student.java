package class_test_2;

public class Student {
    String name;
    int age;
    String addr;
    int num;
    String call;

    //7번
    public Student(String name, int age, String addr, int num, String call){
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.num = num;
        this.call = call;
    }

    //8번
    public void setName(){
        this.name = name;
    }
    public void setAge(){
        this.age = age;
    }
    public void setAddr(){
        this.addr = addr;
    }
    public void setNum(){
        this.num = num;
    }
    public void setCall(String call){
        this.call = call;
    }

    //9번
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddr(){
        return addr;
    }

    public int getNum(){
        return num;
    }

    public String getCall(){
        return call;
    }

    //10번
    public void printStu(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getAddr());
        System.out.println(getNum());
        System.out.println(getCall());
    }
}


