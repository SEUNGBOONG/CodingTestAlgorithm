package LV1;

import java.util.*;

public class UnlikeSameNumber {

    public static int[] solution(int[] arr) {

        // 1 1 3 2 2 2 1
        // 1 3 2 1
        //자료구조를 모르면 이렇게 풀어야한다.
        //스택공부하기

        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        int beforeNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int nowNumber = arr[i];

            if (nowNumber == beforeNumber) {
                continue;
            } else {
                answer.add(nowNumber);
                beforeNumber = nowNumber;
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static int[] solution2(int[] arr) {
        // stack 풀이 -> 문제의 의도
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            if (stack.peek() == i) {
                continue;
            } else {
                stack.push(i);
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (Integer i : stack) {
            answer.add(i);
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) {
        // 1 3 0 1
        System.out.println(Arrays.toString(solution2(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
