//https://school.programmers.co.kr/learn/courses/30/lessons/120846
package ProblemsLv0;

public class CompositeNumber {
    public int count(int n){
        OrderedPair orderedPair = new OrderedPair();
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(orderedPair.count(i) >= 3){
                answer++;
            }
        }
        return answer;
    }
}
