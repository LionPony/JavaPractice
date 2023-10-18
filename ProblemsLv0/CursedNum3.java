//https://school.programmers.co.kr/learn/courses/30/lessons/120871
package ProblemsLv0;

public class CursedNum3 {
    //Translate decimal system to Cursed vileage use.
    public int cursedNum3(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            result++;
            while(result%3 == 0 || String.valueOf(result).contains("3")){
                result++;
            }
        }
        return result;
    }
}
