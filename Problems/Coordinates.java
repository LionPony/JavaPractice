package Problems;

//https://school.programmers.co.kr/learn/courses/30/lessons/120841
public class Coordinates {
    //Figure out dot`s quadrant.
    //dot[0] means x position, dot[1] means y position.
    //dot is not blank, -500 <= dot ingredients <= 500
    public int figureQuadrant(int[] dot){
        if(dot[0] < 0){
            if(dot[1] < 0){
                return 3;
            }
            else{
                return 2;
            }
        }
        else{
            if(dot[1] < 0){
                return 4;
            }
            else{
                return 1;
            }
        }
    }
}
