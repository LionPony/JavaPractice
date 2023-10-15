//https://school.programmers.co.kr/learn/courses/30/lessons/120891
package ProblemsLv0;

public class ThreeSixNine {
    ////Count how many 3, 6, 9 in given number.
    public int countClap(int order){
        int digit;
        int count = 0;
        while(order > 0){
            digit = order%10;
            if(digit == 3 || digit == 6 || digit == 9){
                count++;
            }
            order /= 10;
        }
        return count;
    }
}
