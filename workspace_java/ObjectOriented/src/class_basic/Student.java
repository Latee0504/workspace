package class_basic;

public class Student {
    String name;
    int age;
    int score;

    //매개변수로 전달된 문자열로 name 값을 변경하는 메서드
    public String setName(String name1){
        name = name1;
        return name;
    }

    //나이를 변경하는 메서드 생성
    public int setAge(int age1){
        age = age1;
        return age;
    }

    public void introduce(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("점수 : " + score);
    }

}
