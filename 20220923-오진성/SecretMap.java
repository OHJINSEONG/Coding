import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        long[] ejin = Arrays.stream(arr1).mapToLong(i -> Long.parseLong(Integer.toBinaryString(i))).toArray();
        long[] ejin2 = Arrays.stream(arr2).mapToLong(i -> Long.parseLong(Integer.toBinaryString(i))).toArray();
        List<String> sumEJin = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            String sum = "";

            int index = n - String.valueOf((ejin[i] + ejin2[i])).length();

            for (int j = 0; j < index; j += 1) {
                sum += "0";
            }

            sum += String.valueOf((ejin[i] + ejin2[i]));

            String row = Arrays.stream(sum.split("")).map(pair -> pair.equals("0") ? " " : "#").collect(Collectors.joining());

            sumEJin.add(row);
        }

        answer = sumEJin.toArray(new String[0]);

        return answer;
    }
}
