package 백준알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class 단어수학 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        String x = scanner.next();
        List<String> xList = List.of(x.split(""));
        String y = scanner.next();
        List<String> yList = List.of(y.split(""));

        for(int j=0; j< xList.size();j++){
            if(Objects.equals(xList.get(i), "A")){

            }
        }

    }
}
