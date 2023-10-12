package ProblemsLv0;

public class Stringinstring {
    //If str1 contains str2 return 1 else return 2.
    public int contains(String str1, String str2){
        for(int i = 0; i <= str1.length(); i++){
            for(int j = i; j <= str1.length(); j++){
                if(str2.equals(str1.substring(i, j))){
                    return 1;
                }
            }
        }
        return 2;
    }
}
