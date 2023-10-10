//https://school.programmers.co.kr/learn/courses/30/lessons/120840
package ProblemsLv0;

public class Combination {
    //Find out combination
    //Overflow issue can be occurred.
    public int combination(int balls, int share){
        return factorial(balls)/(factorial(balls-share)*factorial(share));
    }
    //Function factorial. It works recursively.
    public int factorial(int num){
        if(num <= 1){
            return num;
        }
        return num*factorial(num-1);
    }
    //Using recurrence relation to make combination.
    public int combinationRelation(int balls, int share){
        if(balls == share || share == 0){
            return 1;
        }
        else{
            return combinationRelation(balls-1, share-1) + combinationRelation(balls-1, share);
        }
    }
}