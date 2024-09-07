package 금융권.sol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 일곱난쟁이 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            int numbers = scanner.nextInt();
            list.add(numbers);
            answer += list.get(i);
        }

        int removeIdx1 = -1;
        int removeIdx2 = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (answer - list.get(i) - list.get(j) == 100) {
                    removeIdx1 = i;
                    removeIdx2 = j;
                    break;
                }
            }
            if (removeIdx1 != -1) {
                break;
            }
        }

        // 인덱스 역순으로 삭제 (큰 인덱스부터 삭제해야 다른 인덱스에 영향 없음)
        if (removeIdx1 != -1 && removeIdx2 != -1) {
            list.remove(removeIdx2);
            list.remove(removeIdx1);
        }

        // 출력
        System.out.println(list);
    }
}
