import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] letters = Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .toArray();

        int max = Arrays.stream(letters).max().getAsInt();
        int min = Arrays.stream(letters).min().getAsInt();

        return min+" "+ max;
    }
}
