//https://school.programmers.co.kr/learn/courses/30/lessons/120836
package ProblemsLv0;

public class OrderedPair {
    //Count OrderedPair of Integer N
    public int count(int n){
        //This make time complexity n to log n
        int goal = (int) Math.sqrt(n);
        int count = 0;
        for(int i = 1; i <= goal; i++){
            if(n%i==0){
                count++;
            }
        }
        //In case of common divisor is sqrt of n.
        if(goal*goal == n) {
            return count * 2 -1;
        }
        else {
            return count * 2;
        }
    }
}
