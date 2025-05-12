package LV3;

import java.math.BigInteger;

public class 피보나치 {

        public static void main(String[] args) {
            BigInteger a = new BigInteger("12345678999");
            BigInteger b = new BigInteger("99987654321");

            BigInteger f1 = BigInteger.ONE;
            BigInteger f2 = new BigInteger("2");
            BigInteger sum = BigInteger.ZERO;
            int count = 0;

            while (f1.compareTo(b) <= 0) {
                if (f1.compareTo(a) >= 0) {
                    sum = sum.add(f1);
                    count++;
                }
                BigInteger next = f1.add(f2);
                f1 = f2;
                f2 = next;
            }

            System.out.println("개수: " + count);
            System.out.println("합계: " + sum);
        }

}
