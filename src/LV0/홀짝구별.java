package LV0;

import java.util.Scanner;

public class 홀짝구별 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("%d is even" + n);
        } else {
            System.out.println("%d is odd" + n);
        }
    }
}
