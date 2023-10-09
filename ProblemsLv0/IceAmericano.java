//https://school.programmers.co.kr/learn/courses/30/lessons/120819
package ProblemsLv0;

public class IceAmericano {
    int price = 5500;
    //How many americano can he drink and checkout changes.
    public int[] howManyAmericano(int money){
        int[] result = new int[2];
        result[0] = money/price;
        result[1] = money%price;
        return result;
    }
}