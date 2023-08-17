import java.util.*;

class Solution {
    static public List<Integer> solution(int n, String[] words) {
        List<Integer> answer = new ArrayList<>();

        List<String> list = new ArrayList<>();

        int round = 1;
        int who = 1;
        boolean check = false;

        char lastWord = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            if (who > n) {
                who = 1;
                round++;
            }

            String word = words[i];
            if (list.contains(word) || word.charAt(0) != lastWord) {
                check = true;
                break;
            } else {
                list.add(word);
                who++;
                lastWord = word.charAt(word.length() - 1);
            }
        }

        if (check) {
            answer.add(who);
            answer.add(round);
        } else {
            answer.add(0);
            answer.add(0);
        }

        return answer;
    }
}
