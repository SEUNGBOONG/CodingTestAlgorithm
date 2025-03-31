package 와이즈넛코테준비.해시;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.util.Arrays.*;

public class 완주하지못한선수 {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            sort(participant);
            sort(completion);
            Map<Integer, String> map = new HashMap<>();

            for(int i =0; i<participant.length; i++){
                for(int j = 0; j<completion.length;j++){
                    if(Objects.equals(participant[i], completion[j])){
                        map.put(1,participant[i]);

                    }
                    else{
                        map.put(0,participant[i]);
                    }
                }

            }
            return map.get(0);
        }
    }
}
