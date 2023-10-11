package ProblemsLv0;

public class Babbling {
    String[] canBabbling = new String[]{"aya", "ye", "woo", "ma"};
    public int count(String[] babbling){
        int count = 0;
        for(String bab : babbling){
            StringBuilder tempBab = new StringBuilder();
            for(int i = 0; i < bab.length(); i++){
                tempBab.append(bab.charAt(i));
                if(can(tempBab.toString())){
                    tempBab = new StringBuilder();
                }
            }
            if(tempBab.isEmpty()){
                count++;
            }
        }
        return count;
    }
    public boolean can(String babbling){
        for(String compare : canBabbling){
            if(compare.equals(babbling)){
                return true;
            }
        }
        return false;
    }
}
