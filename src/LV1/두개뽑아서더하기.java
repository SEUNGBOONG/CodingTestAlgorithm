package LV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 두개뽑아서더하기 {

    public List<Integer> solution(List<Integer> numbers) {
        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                int sum = numbers.get(i) + numbers.get(j);
                resultSet.add(sum);
            }
        }

        List<Integer> resultList = new ArrayList<>(resultSet);
        Collections.sort(resultList);
        return resultList;
    }
}
