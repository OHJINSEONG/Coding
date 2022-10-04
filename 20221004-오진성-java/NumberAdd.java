import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = Arrays.stream(String.valueOf(n).split("")).map(Integer::parseInt)
                .reduce(Integer::sum).get();

        return answer;
    }
}