//https://school.programmers.co.kr/learn/courses/30/lessons/120860
package ProblemsLv0;

public class RectangleArea {
    //Figure out Rectangle area.
    public int rectangleArea(int[][] dots){
        int height = rectangleHeight(dots);
        int width = rectangleWidth(dots);

        return height*width;
    }
    public int rectangleHeight(int[][] dots){
        int x = dots[0][0];
        int y = dots[0][1];

        for(int i = 1; i < dots.length; i++){
            if(x == dots[i][0]){
                return (int)Math.sqrt(Math.pow(y-dots[i][1], 2));
            }
        }
        return -1;
    }
    public int rectangleWidth(int[][] dots){
        int x = dots[0][0];
        int y = dots[0][1];

        for(int i = 1; i < dots.length; i++){
            if(y == dots[i][1]){
                return (int)Math.sqrt(Math.pow(x-dots[i][0], 2));
            }
        }
        return -1;
    }
}
