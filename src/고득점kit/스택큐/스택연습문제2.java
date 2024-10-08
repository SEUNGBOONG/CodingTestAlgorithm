package 고득점kit.스택큐;

import java.util.Stack;

public class 스택연습문제2 {
    //    boolean solution(String s) {
//        // stack으로 문제 푼다
//        Stack<Character> branket = new Stack<>();
//        boolean answer = false;
//
//        // 2. 언제 정답이 true일지 규칙을 찾는다.
//
//
//        // 3. 문자열 하나하나를 뜯어서 Stack에 넣으면서 비교를 한다
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//        }
//
//        return branket.isEmpty();
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
