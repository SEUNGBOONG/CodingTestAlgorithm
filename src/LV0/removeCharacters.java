package LV0;

public class removeCharacters {
    public String solution(String my_string, String letter) {
        String answer = "";
        if(my_string.contains(letter)){
            answer=my_string.replace(letter,""); //이런식으로도 제거가 되는구나 기억
        }
        else
        {
            answer=my_string;
        }
        return answer;
    }
}
