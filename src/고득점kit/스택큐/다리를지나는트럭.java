package 고득점kit.스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> latetruck = new LinkedList<>();
        Queue<Integer> ingtruck = new LinkedList<>();
        int sum = 0;
        for (int j = 0; j<truck_weights.length; j++){
            if(ingtruck.size()<bridge_length){
                for(int i = 0; i<ingtruck.size();i++){
                    sum+=ingtruck.peek();
                    if(sum<weight){
                        ingtruck.add(truck_weights[j]);
                        answer++;
                    }
                }
                sum=0;

            }
            else {
                latetruck.add(ingtruck.remove());
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        다리를지나는트럭 a = new 다리를지나는트럭();
        System.out.println(a.solution(2,10,new int[]{7, 4, 5, 6}));
    }


}
