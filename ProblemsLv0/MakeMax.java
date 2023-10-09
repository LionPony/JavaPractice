//https://school.programmers.co.kr/learn/courses/30/lessons/120847

package ProblemsLv0;

public class MakeMax {
    //Make product of two numbers max.
    public int maxProduct(int[] numbers) {
        int max = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i]*numbers[j] > max){
                    max = numbers[i]*numbers[j];
                }
            }
        }
        return max;
    }
}
