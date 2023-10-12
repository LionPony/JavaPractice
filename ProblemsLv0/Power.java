package ProblemsLv0;

public class Power {
    public int power(int n, int t){
        if(t < 1){
            return n;
        }
        return n*power(n, t-1);
    }
}
