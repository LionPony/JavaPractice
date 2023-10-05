//Start of Coding test problem:protractor
public class Protractor {
    //Classify angle.
    public int classify(int angle){
        if(angle < 90){
            return 1;
        }
        else if(angle == 90){
            return 2;
        }
        else if(angle < 180){
            return 3;
        }
        else if(angle == 180){
            return 4;
        }
        else{
            return -1;
        }
    }
}
