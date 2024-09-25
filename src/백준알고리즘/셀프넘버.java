package 백준알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 셀프넘버 {

    public static void main(String[] args) {
        String number = "33";

        int emd;
        List<String> numberList = new ArrayList<>();
        while (true) {
            emd = 0;
            numberList.add(number);
            List<Integer> a = Collections.singletonList(Integer.parseInt(Arrays.toString(number.split(""))));
            for (Integer integer : a) {
                emd += integer;
            }
            int number2= Integer.parseInt(number)+emd;
            number=String.valueOf(number2);
            if(number2>1000){
                break;
            }
        }


    }
}
