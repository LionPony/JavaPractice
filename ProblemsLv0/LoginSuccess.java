//https://school.programmers.co.kr/learn/courses/30/lessons/120883
package ProblemsLv0;

import java.util.HashMap;

public class LoginSuccess {
    //Compare db and id_pw. If id, pw pair is in db return login, else return error.
    public String loginSuccess(String[] id_pw, String[][] db){
        //Preprocessing
        HashMap<String, String> accounts = new HashMap<>();
        for(String[] data : db){
            accounts.put(data[0], data[1]);
        }

        if(accounts.containsKey(id_pw[0])){
            if(accounts.get(id_pw[0]).equals(id_pw[1])){
                return "login";
            }
            else{
                return "wrong pw";
            }
        }
        else{
            return "fail";
        }
    }
}
