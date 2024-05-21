package LV2;

import java.util.Stack;

public class 스택연습문제2 {
    boolean solution(String s) {
        // stack으로 문제 푼다
        Stack<Character> branket = new Stack<>();
        boolean answer = false;

        // 2. 언제 정답이 true일지 규칙을 찾는다.

        // 3. 문자열 하나하나를 뜯어서 Stack에 넣으면서 비교를 한다
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        }

        // 4. 스택 사이즈를 보고 정답이 맞는지 아닌지 반환한다
        return branket.isEmpty();
    }
}
