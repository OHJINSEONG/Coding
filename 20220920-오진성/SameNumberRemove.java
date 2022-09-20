import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        int saveNum = -1;
        for (int i = 0; i < arr.length; i+=1) {

            if (saveNum != arr[i]) {

                saveNum = arr[i];

                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i+=1) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}