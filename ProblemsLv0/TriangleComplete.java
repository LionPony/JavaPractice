package ProblemsLv0;

public class TriangleComplete {
    public int complete(int[] sides){
        int max = max(sides);
        int sum = 0;
        for(int i : sides){
                sum += i;
        }
        if(max < sum-max){
            return 1;
        }
        else {
            return 2;
        }
    }
    public int max(int[] sides){
        int max = 0;
        for(int i : sides){
            if(i >= max){
                max = i;
            }
        }
        return max;
    }
}
