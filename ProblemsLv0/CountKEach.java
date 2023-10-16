//https://school.programmers.co.kr/learn/courses/30/lessons/120887
package ProblemsLv0;

public class CountKEach {
    //How many letter k appers in i~j.
    public int countKEach(int i, int j, int k){
        int result = 0;
        for(; i<= j; i++){
            result += countDigitK(i, k);
        }
        return result;
    }
    //If digit is k count it.
    public int countDigitK(int i, int k){
        int result = 0;
        while(i > 0){
            if(i%10 == k){
                result++;
            }
            i /= 10;
        }
        return result;
    }
}
