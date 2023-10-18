//https://school.programmers.co.kr/learn/courses/30/lessons/120868
package ProblemsLv0;

public class TriangleComplete2 {
    //Count cannable triangle.
    public int triangleComplete2(int[] sides){
        int count = 0;
        //case1:max in sides.
        int max;
        int other;

        if(sides[0] >= sides[1]){
            max = sides[0];
            other = sides[1];
        }
        else{
            max = sides[1];
            other = sides[0];
        }

        for(int i = 1; i <= max; i++){
            if(other + i > max){
                count++;
            }
        }

        //case2:max in out.
        for(int i = max+1; i < max+other; i++){
            count++;
        }

        return count;
    }
}
