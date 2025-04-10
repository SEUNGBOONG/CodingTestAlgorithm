package LV1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> q = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));
        Queue<String> q3 = new LinkedList<>(Arrays.asList(goal));
        for(int i=0; i<q3.size();i++){
            if(q3.peek().equals(q.peek())){
                q3.poll();
                q.poll();
            }
            else if(q3.peek().equals(q2.peek())){
                q3.poll();
                q2.poll();
            }

        }
        if(!q3.isEmpty()){
            System.out.println(q3);
            return "No";
        }

        return "Yes";
    }

}
