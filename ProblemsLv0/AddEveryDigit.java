package ProblemsLv0;

public class AddEveryDigit {
    public int addEveryDigit(int n){
        return addEveryDigit(n, 0);
    }
    public int addEveryDigit(int n, int result){
        if( n == 0) {
            return result;
        }
        result += n%10;
        n /= 10;
        return  addEveryDigit(n, result);
    }
}
