//https://school.programmers.co.kr/learn/courses/30/lessons/120912
package ProblemsLv0;

public class NumbersOfSeven {
    //Count how many '7' appears in integer array.
    public int numbersOfSeven(int[] array){
        int count = 0;
        for(int i : array){
            count += count(i);
        }
        return count;
    }
    //Count how many '7' appears in integer.
    public int count(int num){
        int count = 0;
        while(num > 0){
            if(num%10 == 7) count++;
            num /= 10;
        }
        return count;
    }
}
