//https://school.programmers.co.kr/learn/courses/30/lessons/120909
package ProblemsLv0;

public class DistinctSquareNumber {
    public int distinct(int n){
        int log = (int)Math.sqrt(n);
        if(log*log == n){
            return 1;
        }
        else{
            return 2;
        }
    }
}
