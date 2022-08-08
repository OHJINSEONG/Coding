import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(int n) {
        String answer = "";
        List<String> watermelonClaps = new ArrayList<>();
        for (int i = 0; i < n; i += 1) {
            if (i % 2 == 0) {
                watermelonClaps.add("수");
            }
            if (i % 2 == 1) {
                watermelonClaps.add("박");
            }
        }

        for(String watermelonClap : watermelonClaps){
            answer+=watermelonClap;
        }

        return answer;
    }
}
