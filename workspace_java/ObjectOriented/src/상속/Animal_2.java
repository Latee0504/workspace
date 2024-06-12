package 상속;

public class Animal_2 {
    public static void main(String[] args) {

        Animal[] animalHouse = new Animal[10];
        Dog d1 = new Dog();
        Cat cat1 = new Cat();
        Cow cow1 = new Cow();

        animalHouse[0] = d1;
        animalHouse[1] = cat1;
        animalHouse[2] = cow1;

        //Animal클래스의 변수, 메서드 사용가능
        //Dog 클래스의 변수, 메서드 사용 불가.
        //상속을 통해 부모클래스에 자식클래스 객체를 저장 시 부모클래스의 변수, 메서드만 사용 가능.
        //animalHouse[0].barkDog(); 다향성으로 인해 불가능

        for(int i = 0; i < 3; i++){
            animalHouse[i].bark();
        }
    }
}
