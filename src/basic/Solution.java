package basic;

import java.util.Arrays;
import java.util.Scanner;

class Solution {

    //내가 푼것 로직은 맞았으나 프로그래머스에 익숙해질 필요가 있음
    public String[] sol(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("문장을 입력하세요:");
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        String beforeString = scanner.nextLine();
        String[] answer = solution.sol(beforeString);
        System.out.println(Arrays.toString(answer)); // 배열을 출력이거 외워
    }
}

//프로그래머스 코테 방식

class Exam {

    public String[] solution(String my_string) {
        String[] answer = {};

        String[] split = my_string.split(" ");
        answer = new String[split.length];

        method(split, answer);

        return answer;
    }

    private static void method(String[] split, String[] answer) {
        System.arraycopy(split, 0, answer, 0, split.length);
    }

    public static void main(String[] args) {
        Exam e = new Exam();
        // i, love, you
        System.out.println(e.solution("i love you"));
    }
}
