//https://school.programmers.co.kr/learn/courses/30/lessons/120814

package ProblemsLv0;

public class PizzaDivide {
    //Count how many plate to serve n people.
    public int howManyPlate(int n) {
        int plate = 0;
        while(n > 0){
            plate++;
            n -= 7;
        }
        return plate;
    }
}
