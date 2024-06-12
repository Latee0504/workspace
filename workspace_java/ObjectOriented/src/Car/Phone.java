package Car;

//접근제한자 : 클래스, 메서드, 멤버변수에서 사용.

//멤버변수에는 무조건 private
//메서드는 무조건 public
public class Phone {
    private int price;
    public String modelName;
    String brand;

    //생성자
    public Phone(){
        this.price = 0;
        this.modelName = "";
    }

    //접근제한자 : 클래스, 메서드, 멤버변수에서 사용
    //1. public 프로젝트 내에 존재하면 접근 가능
    //2. default 같은 패키지 내에 있으면 접근 가능
    //3. protected 같은 클래스, 상속받은 클래스 안에서만 접근 가능
    //4. private 변수, 메서드가 선언된 클래스 안에서만 접근가능

    private void setPrice(int price){
        if (price<0){
            this.price = 0;
        }
        else {
            this.price = price;

        }
    }
}
