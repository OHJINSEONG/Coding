import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>();

        int[] pattern1 = new int[]{1, 2, 3, 4, 5};
        int[] pattern2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < answers.length; i += 1) {
            if (answers[i] == pattern1[index1]) {
                a += 1;
            }

            if (answers[i] == pattern2[index2]) {
                b += 1;
            }
            if (answers[i] == pattern3[index3]) {
                c += 1;
            }
            index1 += 1;
            index2 += 1;
            index3 += 1;

            if (index1 == 5) {
                index1 = 0;
            }
            if (index2 == 8) {
                index2 = 0;
            }
            if (index3 == 10) {
                index3 = 0;
            }
        }

        answer.add(a);
        answer.add(b);
        answer.add(c);

        System.out.println("" + a);
        System.out.println("" + b);
        System.out.println("" + c);

        int max = Math.max(Math.max(a, b), c);

        for (int i = 0; i < answer.size(); i += 1) {
            if (max == answer.get(i)) {
                answer1.add(i + 1);
            }
        }

        return answer1;
    }
}