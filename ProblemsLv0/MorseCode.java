package ProblemsLv0;

import java.util.HashMap;
import java.util.StringTokenizer;

public class MorseCode {
    String[] morseCode = new String[]{".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    HashMap<String, Character> translator = new HashMap<>();
    public MorseCode(){
        for(int i = 0; i < morseCode.length; i++){
            translator.put(morseCode[i], (char) (i+97));
        }
    }
    //Translate Morse code to English
    public String translate(String letter){
        StringTokenizer words = new StringTokenizer(letter, " ");
        StringBuilder result = new StringBuilder();

        while(words.hasMoreElements()){
            result.append(translator.get(words.nextToken()));
        }

        return result.toString();
    }
}
