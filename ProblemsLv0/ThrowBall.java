//https://school.programmers.co.kr/learn/courses/30/lessons/120843
package ProblemsLv0;

public class ThrowBall {
    //Find who throws last ball.
    public int hopping(int[] numbers, int k) {
        int hop = 2;
        return numbers[((k*hop-hop)%numbers.length)];
    }
}
