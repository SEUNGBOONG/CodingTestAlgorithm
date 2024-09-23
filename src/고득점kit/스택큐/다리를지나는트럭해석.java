package 고득점kit.스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭해석 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<Integer>();
        int answer = 0;

        int sum = 0; // 다리를 건너는 트럭들의 무게 합

        for(int t : truck_weights) {

            while(true) {
                //큐가 비어있다면 다음 트럭 삽입
                if(q.isEmpty()) {
                    q.offer(t);
                    sum += t;
                    answer++;
                    break;
                }
                //큐의 사이즈와 다리의 길이가 같다면 큐에서 큐에서 처음 값을 빼고 최대 무게 -
                else if(q.size() == bridge_length) {
                    sum -= q.poll();
                }
                //큐가 비어있지 않을 때
                else {
                    //다음 트럭이 최대 무게 초과
                    if(sum + t > weight) {
                        q.offer(0);
                        answer++;
                    }
                    //다음 트럭이 최대 무게 이내
                    else {
                        q.offer(t);
                        sum += t;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer+bridge_length;
    }

    public static void main(String[] args) {
        다리를지나는트럭해석 a = new 다리를지나는트럭해석();

        System.out.println(a.solution(2,10, new int[]{7, 4, 5, 6}));
    }
}

