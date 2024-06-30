package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 숫자짝꿍 {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for(String a : X.split("")){
            arrX[Integer.parseInt(a)]++;
        }

        for(String b : Y.split("")){
            arrY[Integer.parseInt(b)]++;
        }

        for(int i=9; i>=0; i--){
            if(arrX[i]>0 && arrY[i]>0){
                int tmpInt = Math.min(arrX[i], arrY[i]);
                for(int j=0; j<tmpInt; j++){
                    sb.append(i);
                }
            }
        }

        if (sb.length()>0){
            answer = sb.charAt(0)=='0'? "0": sb.toString();
        } else {
            answer = "-1";
        }

        return answer;
    }
}
