//https://school.programmers.co.kr/learn/courses/30/lessons/120830
//0<n<1000, n/10 <= k < 1000
public class LambSkewers {
    static int lambSkewersPrice = 12000;
    static int beveragePrice = 2000;
    //Figure out how much u eat.
    public int sum(int n, int k){
        return lambSkewersPrice*n + beveragePrice*(k-(n/10));
    }
}
