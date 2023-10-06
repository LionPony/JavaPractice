//https://school.programmers.co.kr/learn/courses/30/lessons/120824
public class NumsEvenOdd {
    //Count Odd, Even in Array.
    public int[] countEvenOdd(int[] num_list){
        int countEven = 0;
        int countOdd = 0;

        for (int i : num_list) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new int[]{countEven, countOdd};
    }
}
