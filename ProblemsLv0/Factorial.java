package ProblemsLv0;

public class Factorial {
    public int factorial(int num){
        if(num <= 1){
            return num;
        }
        return num*factorial(num-1);
    }
    public int maxfactorial(int n){
        int count = 1;
        while(factorial(count) <= n){
            count++;
        }
        return count-1;
    }
}
