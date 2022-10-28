import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public void updateHandPosition(HashMap<String, String> handPosition, String rl, String numberPosition) {
        handPosition.replace(rl, numberPosition);
    }


    public String calculateDistance(HashMap<String, String> handPosition, int i, String majarHand, HashMap<Integer, String> numberPosition) {
        String[] coordinate = numberPosition.get(i).split(" ");

        String[] leftHandCoordinate = handPosition.get("L").split(" ");

        String[] rightHandCoordinate = handPosition.get("R").split(" ");
        int leftDistance = Math.abs(Integer.parseInt(coordinate[0]) - Integer.parseInt(leftHandCoordinate[0]))
                + Math.abs(Integer.parseInt(coordinate[1]) - Integer.parseInt(leftHandCoordinate[1]));
        int rightDistance = Math.abs(Integer.parseInt(coordinate[0]) - Integer.parseInt(rightHandCoordinate[0]))
                + Math.abs(Integer.parseInt(coordinate[1]) - Integer.parseInt(rightHandCoordinate[1]));
        if (i == 1 || i == 4 || i == 7) {
            updateHandPosition(handPosition, "L", numberPosition.get(i));
            return "L";
        }

        if (i == 3 || i == 6 || i == 9) {
            updateHandPosition(handPosition, "R", numberPosition.get(i));
            return "R";
        }

        if (leftDistance < rightDistance) {
            updateHandPosition(handPosition, "L", numberPosition.get(i));
            return "L";
        }
        if (leftDistance > rightDistance) {
            updateHandPosition(handPosition, "R", numberPosition.get(i));
            return "R";
        }
        if (majarHand.equals("right")) {
            updateHandPosition(handPosition, "R", numberPosition.get(i));
            return "R";
        }
        updateHandPosition(handPosition, "L", numberPosition.get(i));
        return "L";
    }

    public String solution(int[] numbers, String hand) {
        HashMap<String, String> handPosition = new HashMap<>();
        HashMap<Integer, String> numberPosition = new HashMap<>();

        numberPosition.put(1, "1 1");
        numberPosition.put(2, "2 1");
        numberPosition.put(3, "3 1");
        numberPosition.put(4, "1 2");
        numberPosition.put(5, "2 2");
        numberPosition.put(6, "3 2");
        numberPosition.put(7, "1 3");
        numberPosition.put(8, "2 3");
        numberPosition.put(9, "3 3");
        numberPosition.put(0, "2 4");

        handPosition.put("L", "1 4");
        handPosition.put("R", "3 4");

        List<String> array = new ArrayList<>();
        array = Arrays.stream(numbers).mapToObj(e -> calculateDistance(handPosition, e, hand, numberPosition)).collect(Collectors.toList());

        String answer = "";

        for (String word : array) {
            answer += word;
        }
        return answer;
    }
}
