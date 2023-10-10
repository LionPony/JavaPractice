package ProblemsLv0;

import java.util.Comparator;

public class RockScissorsPaper implements Comparable<RockScissorsPaper>{
    char element;
    public RockScissorsPaper(){

    }
    public RockScissorsPaper(char element){
        this.element = element;
    }
    public char getElement(){
        return element;
    }
    public String winCase(String rsp){
        RockScissorsPaper rock = new RockScissorsPaper('0');
        RockScissorsPaper scissors = new RockScissorsPaper('2');
        RockScissorsPaper paper = new RockScissorsPaper('5');
        RockScissorsPaper newOne;

        RockScissorsPaper[] allCase = new RockScissorsPaper[]{rock, scissors, paper};
        String result = "";

        for(int i = 0; i < rsp.length(); i++){
            newOne = new RockScissorsPaper(rsp.charAt(i));
            for(RockScissorsPaper comparison : allCase){
                if(comparison.compareTo(newOne) == 1){
                    result += comparison.getElement();
                    break;
                }
            }
        }

        return result;
    }
    public int compareTo(RockScissorsPaper rsp_1){
        if(element == '2'){
            if(rsp_1.getElement() == '0'){
                return -1;
            }
            else if(rsp_1.getElement() == '2'){
                return 0;
            }
            else{
                return 1;
            }
        }
        else if(element == '0'){
            if(rsp_1.getElement() == '0'){
                return 0;
            }
            else if(rsp_1.getElement() == '2'){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            if(rsp_1.getElement() == '0'){
                return 1;
            }
            else if(rsp_1.getElement() == '2'){
                return -1;
            }
            else{
                return 0;
            }
        }
    }

}
