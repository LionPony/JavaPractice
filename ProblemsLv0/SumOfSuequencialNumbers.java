// https://school.programmers.co.kr/learn/courses/30/lessons/120923
package ProblemsLv0;

public class SumOfSuequencialNumbers {
    // Total is sum of num consecutive numbers.
    // Find out consecutive numbers.
    public int[] sumOfSuequencialNumbers(int num, int total){
        int[] result = new int[num];
        int first = (total - arithmetic(num-1))/num;
        for(int i = 0; i < result.length; i++){
            result[i] = first+i;
        }
        return result;
    }
    public int arithmetic(int n){
        if(n > 0){
            return n+arithmetic(n-1);
        }
        else{
            return 0;
        }
    }
}
