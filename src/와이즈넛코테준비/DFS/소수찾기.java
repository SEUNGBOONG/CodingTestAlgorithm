//package 와이즈넛코테준비.DFS;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Stack;
//
//public class 소수찾기 {
//    import java.util.*;
//
////1 3 7
//
//// 1 -> true -> 판별 x 1, 3 ->true 13 ->판별 count ++; 1 3 7 true count++;
//// 3 7 13 17 31 37 71 73 137
//
//    class Solution {
//        public int solution(String numbers) {
//            int answer = 0;
//            int[] ary = new int[]{Integer.parseInt(numbers)};
//            boolean[] visited = new boolean[ary.length];
//
//
//            return answer;
//        }
//        public void dfs(boolean[] visited, int[] ary, List<Integer> list){
//
//            for(int i =0; i<ary.length;i++){
//                visited[i]=true;
//                if(prime(ary[i])){
//                    list.add(ary[i]);
//                }
//
//            }
//        }
//
//
//        public boolean prime(int numbers){
//            int count =0;
//            boolean tf;
//            for(int i =1; i<numbers;i++){
//                if(numbers%i==0){
//                    count++;
//                }
//            }
//
//            if(count == 2){
//                tf=true;
//            }
//            return false;
//        }
//        public Stack<Integer> solution(int[] arr) {
//            Stack<Integer> stack = new Stack<>();
//            for(int i =0; i<arr.length;i++){
//                if(!stack.containsAll(Collections.singleton(arr[i]))){
//                    stack.add(arr[i]);
//                }
//            }
//
//            return stack;
//        }
//    }
//
//}
