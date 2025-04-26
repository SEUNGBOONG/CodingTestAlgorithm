package LV1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 대강만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        Map<Character, Integer> keyMap = new HashMap<>();
        for(String key: keymap){
            for(int i =0;i<key.length();i++){
                char ch = key.charAt(i);
                int pressCount = i+1;

                if(keyMap.containsKey(ch)){
                    keyMap.put(ch, Math.min(keyMap.get(ch), pressCount));
                }else {
                    keyMap.put(ch,pressCount);
                }
            }
        }

        for(int i = 0; i<targets.length;i++){
            int sum =0;
            for (char ch : targets[i].toCharArray()){
                if(keyMap.containsKey(ch)){
                    sum+=keyMap.get(ch);
                }
                else{
                    sum=-1;
                    break;
                }
            }
            answer[i]= sum;
        }
        return answer;
    }
}
