package 고득점kit.해시;

import java.util.ArrayList;
import java.util.List;

public class 폰켓몬 {
    public int solution(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        for (int num : nums) {
            if (!answer.contains(num)) {
                answer.add(num);
            }
        }

        return Math.min(nums.length / 2, answer.size());
    }
}
