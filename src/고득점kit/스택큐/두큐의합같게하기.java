package 고득점kit.스택큐;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 두큐의합같게하기 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1=Arrays.stream(queue1).sum();
        long sum2=Arrays.stream(queue2).sum();

        int temporalNumber = 0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long totalsum=sum1+sum2;

        if(totalsum%2==1)return -1;

        long targetSum=totalsum/2;

        for(int i = 0; i<queue1.length;i++){
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }


        while (sum1!=targetSum){
            if(sum1<targetSum){
                temporalNumber=q2.poll();
                q1.offer(temporalNumber);
                sum1+=temporalNumber;

            }
            else{
                temporalNumber=q1.poll();
                q2.offer(temporalNumber);
                sum2-=temporalNumber;

            }
            answer++;

        }

        if(answer> queue1.length*4-1) return -1;




        return answer;
    }


}
