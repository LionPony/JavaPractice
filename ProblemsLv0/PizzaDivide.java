//https://school.programmers.co.kr/learn/courses/30/lessons/120814

package ProblemsLv0;

public class PizzaDivide {
    //Count how many plate to serve people. Pizza divided 7.
    public int howManyPlate(int n) {
        int plate = 0;
        int pcs = 7;
        while(n > 0){
            plate++;
            n -= pcs;
        }
        return plate;
    }
    //Count how many plate to eat equal pieces.
    public int equalPlate(int n) {
        int pcs = 6;
        return getLCM(pcs, n)/pcs;
    }
    //Count how many plate to serve people. Pizza pieces are given by parameter.
    public int howManyPlate(int n, int pcs) {
        int plate = 0;
        while(n > 0){
            plate++;
            n -= pcs;
        }
        return plate;
    }
    //Get least common multiple
    public int getLCM(int num1, int num2){
        return num1*num2/getGCD(num1, num2);
    }
    //Get greatest common divisor
    public int getGCD(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return getGCD(num2, num1%num2);
    }
}
