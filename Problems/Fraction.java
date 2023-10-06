//Set of fraction array to solve problems.
package Problems;

public class Fraction {
    //Add 2 fraction. Parameter is seperated fraction.
    public int[] add(int numer1, int denom1, int numer2, int denom2){
        int lcm = getLCM(denom1, denom2);
        numer1 *= (lcm/denom1);
        numer2 *= (lcm/denom2);
        int numerA = numer1+numer2;
        int gcd = getGCD(numerA, lcm);
        return new int[]{numerA/gcd, lcm/gcd};
    }
    //Get Least Common Multiple
    public int getLCM(int denom1, int denom2){
        return denom1*denom2/getGCD(denom1, denom2);
    }
    //Get Greastest Common Divisor. Recursion used.
    public int getGCD(int denom1, int denom2){
        if(denom2 == 0){
            return denom1;
        }
        return getGCD(denom2, denom1%denom2);
    }
}