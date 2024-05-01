package basic;

import java.util.Arrays;

public class EmptyArr {


    public int[] solution(int[] arr) {
        int[] answer = {};
        for(int i=0; i<arr.length; i++){
            int[] temp= new int[answer.length +arr[i]];
            System.arraycopy(answer,0,temp,0,answer.length);
            for(int j=answer.length; j<temp.length; j++){
                temp[j]=arr[i];
            }
            answer=temp;

        }
        return answer;
    }

    public static void main(String[] args) {
        EmptyArr emptyArr = new EmptyArr();
        int[] arr= {5,1,4};
        int[] result = emptyArr.solution(arr);
        System.out.println(Arrays.toString(result));
    }


}

