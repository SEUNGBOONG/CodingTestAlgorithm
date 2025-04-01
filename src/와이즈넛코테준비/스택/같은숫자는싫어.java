package 와이즈넛코테준비.스택;

import java.util.PriorityQueue;
import java.util.Stack;

public class 같은숫자는싫어 {
    public class Solution {
        public Stack<Integer> solution(int []arr) {
            Stack<Integer> stack = new Stack<>();

            stack.add(arr[0]);

            for(int i =1; i<arr.length;i++){
                if(stack.peek()!=arr[i]){
                    stack.add(arr[i]);

                }
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>();

            return stack;
        }
    }
}
