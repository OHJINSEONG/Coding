import java.util.ArrayList;
import java.util.List;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (double numbers : arr) {
            sum += numbers;
        }

        answer = sum / arr.length;

        return answer;
    }
}
