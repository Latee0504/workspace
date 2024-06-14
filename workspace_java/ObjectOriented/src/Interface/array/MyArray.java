package Interface.array;

public class MyArray implements MyArrayUtil{
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < arr1.length; i++){
            result1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            result2 += arr2[i];
        }
        return (result1 + result2) / (double)(arr1.length + arr2.length);
    }

    @Override
//    public boolean isEvenArray(int[] array) {
//        boolean result = true; //기본값 -> true
//
//        for (int i = 0; i < array.length; i++){ //배열마다 돌아다님
//
//            if (array[i] % 2 == 0){ //배열 값이 짝수라면
//            }// 생략
//            else{ //아니라면
//                result = false; //결과는 false
//            }
//        }
//        return result; //result 리턴
//    }
//}
    public boolean isEvenArray(int[] array) {
        for (int e : array){ //배열마다 돌아다님
            if (e % 2 == 1){
                return false; //return은 마지막 실행이므로
            }
        }
        return true; // return false가 실행 된 이후 true는 실행 안 함.
    }
}