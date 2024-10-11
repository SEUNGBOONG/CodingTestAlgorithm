package 백준알고리즘;

import java.util.Scanner;

public class 이동 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //음,양 구분
        if (n > 0) {
            System.out.println("plus");
            //짝,홀 구분
            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } else {
            System.out.println("minus");
            //짝,홀 구분
            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
