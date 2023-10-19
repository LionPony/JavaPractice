//https://school.programmers.co.kr/learn/courses/30/lessons/120878
package ProblemsLv0;

import java.util.HashSet;

public class FiniteDecimalNumber {
    //Distinguish a/b is finite decimal number.
    public int finiteDecimalNumber(int a, int b){
        int gcd = getGCD(a, b);
        int denominator = b / gcd;
        HashSet<Integer> denomFactors = factorization(denominator);

        denomFactors.remove(1);
        for(Integer i : denomFactors){
            if(!isMadeOf2or5(i)){
                return 2;
            }
        }
        return 1;
    }
    //Check out num is made of 2 or 5.
    public boolean isMadeOf2or5(int num){
        while(num > 1){
            if(num%2 == 0){
                num /= 2;
            } else if (num%5 == 0) {
                num /= 5;
            }
            else{
                return false;
            }
        }
        return true;
    }
    //Prime factorization. Use square root of num. It reduces time complexity.
    public HashSet<Integer> factorization(int num) {
        int half = (int) Math.sqrt(num);
        HashSet<Integer> halfFactors = new HashSet<>();

        //Make half of factors.
        for (int i = 1; i <= half; i++) {
            if (num % i == 0) {
                halfFactors.add(i);
            }
        }

        //Make other half base on half.s
        HashSet<Integer> otherHalfFactors = new HashSet<>();
        for (Integer halfFactor : halfFactors) {
            otherHalfFactors.add(num / halfFactor);
        }

        HashSet<Integer> allFactors = new HashSet<>();
        allFactors.addAll(halfFactors);
        allFactors.addAll(otherHalfFactors);

        return allFactors;
    }
    //Get greastest common divisor. Euclidean algorithm. Recursive used.
    public int getGCD(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return getGCD(b, a%b);
        }
    }
}
