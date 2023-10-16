//https://school.programmers.co.kr/learn/courses/30/lessons/120904
package ProblemsLv0;

public class FindNumber {
    //Find index of given. If given is plural return first index appears.
    public int findNumber(int num, int k){
        String numString = String.valueOf(num);
        char kString = String.valueOf(k).charAt(0);
        for(int i = 0; i < numString.length(); i++){
            if(kString == numString.charAt(i)){
                return i+1;
            }
        }
        return -1;
    }
}
