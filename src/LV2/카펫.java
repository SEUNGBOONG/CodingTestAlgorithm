package LV2;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;


        for (int height = 1; height <= sum; height++) {
            if (sum % height == 0) {
                int width = sum / height;
                if (width >= height && (width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }


        }
        return answer;
    }

}


// 10, 2 를 받을 때

// 일단 두수를 더한다
// 약수 조합을 구했을 때, 1, 12 2 6 3 4 이렇게 나오느데 i가 뒤에 값을 역전할때 4,3 break 걸면돼
// 9-> 1 9 , 3 3 같아질떄도포함
// 48 -> 1 48 , 2 24, 3 16, 4 12, 6 8 , 8,6
