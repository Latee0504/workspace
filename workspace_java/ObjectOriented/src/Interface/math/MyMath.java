package Interface.math;

public class MyMath implements MathUtil{

    @Override
    public int getMin(int a, int b) {
        return a < b ? a : b;
    }

    @Override
    public double getCircleArea(int radius) {
//        if(radius < 0){
//            return 0;
//        }
//        else {
//            return 2 * Math.PI * radius;
//        }
//
        return radius < 0 ? 0 : 2 * Math.PI * radius;
    }

    @Override
    public int getMultiple(int num1, int n) {
        int result = 1;
        for (int i = 0; i < n; i++){
            result *= num1;
        }
        return result;
    }
}
