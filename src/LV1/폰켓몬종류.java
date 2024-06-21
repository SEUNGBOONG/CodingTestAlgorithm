package LV1;

import java.util.ArrayList;
import java.util.List;

public class 폰켓몬종류 {
    public int solution(int[] nums) {
        List<Integer> number = new ArrayList<>();
         for(int i =0; i<nums.length; i++){
            if(!number.contains(nums[i])) {
                number.add(nums[i]);
                if(number.size()>nums.length/2){
                    break;
                }
            }
        }
        int answer = number.size();

        return answer;
    }
}
