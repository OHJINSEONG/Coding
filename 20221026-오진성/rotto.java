import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[]{};
        int[] answer2 = new int[]{};

        answer = Arrays.stream(lottos).filter(e -> Arrays.stream(win_nums).anyMatch(s -> s == e)).toArray();
        answer2 = Arrays.stream(lottos).filter(e -> e == 0).toArray();

        int a = 7 - (answer.length + answer2.length);
        int b = 7 - answer.length;

        if (a == 7) {
            a = 6;
        }
        if (b == 7) {
            b = 6;
        }

        int[] answer3 = new int[]{a, b};

        return answer3;
    }
}