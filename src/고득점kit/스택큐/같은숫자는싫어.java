package 고득점kit.스택큐;

import java.util.Stack;

public class 같은숫자는싫어 {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }
        return stack;
    }
}
//[1,1,3,3,0,1,1]	[1,3,0,1]
