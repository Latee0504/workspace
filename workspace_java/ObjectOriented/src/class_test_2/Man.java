package class_test_2;

public class Man {
//1번 멤버 선언
    private String name;
    private int age;
    private String addr;

    public Man(String name, int age, String addr){
        //2번 멤버값 초기화
        this.name = name;
        this.age = age;
        this.addr = addr;
    }


    //3번 값 변경 메서드 (setter : 멤버 변수 각각의(하나의) 값을 변경하는 메서드)
    //setter의 이름은 'set(변수명)'으로 반드시 지정
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddr(String addr){
        this.addr = addr;
    }

    //4번 리턴 메서드 (getter : 멤버 변수 각각의 값을 리턴하는 메서드)
    //getter의 이름은 'get(변수명)'으로 반드시 지정

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddr(){
        return addr;
    }
    //5번 출력
    public void printMan(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }
}

