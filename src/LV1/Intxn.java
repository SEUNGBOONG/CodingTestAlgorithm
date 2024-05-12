package LV1;

import java.awt.image.BandedSampleModel;

public class Intxn {
    public long[] solution(int x, int n) {
        int i;
        long[] answer = new long[n];
        for(i=1;i<=n;i++){
            answer[i-1]+=((long) x *i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Intxn intxn = new Intxn();
        intxn.solution(2,5);
        System.out.println();
    }
}
