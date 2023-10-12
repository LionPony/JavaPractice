//https://school.programmers.co.kr/learn/courses/30/lessons/120849
package ProblemsLv0;

public class RemoveBowel {
    String[] vowel = new String[]{"a", "e", "i", "o", "u"};
    public String remove(String my_string){
        for(String i : vowel) {
            my_string = my_string.replaceAll(i, "");
        }
        return my_string;
    }
}
