package LV3;

import java.util.Arrays;

public class 숫자게임 {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int idx = 0;
        for (int i = 0; i < B.length; i++) {
            if (A[idx] >= B[i]) continue;
            idx++;
        }
        return idx;
    }


    public static void main(String[] args) {
        숫자게임 sol = new 숫자게임();
        sol.solution(new int[]{5,1,3,7},new int[]{2,2,6,8});

    }

}
