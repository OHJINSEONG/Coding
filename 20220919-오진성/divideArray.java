import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[0];

        answer = Arrays.stream(arr).filter(i -> i % divisor == 0)
                .sorted()
                .toArray();

        if (answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }
}