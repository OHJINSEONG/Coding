import java.util.HashMap;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void calculateDistance() {
        Solution solution = new Solution();

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

        handPosition.put("L", "1 1");
        handPosition.put("R", "3 4");

        String position = solution.calculateDistance(handPosition, 2, "right", numberPosition);
        assertEquals(handPosition.get("L"), "2 1");

        String position2 = solution.calculateDistance(handPosition, 8, "right", numberPosition);

        handPosition.replace("L", "1 4");

        String position3 = solution.calculateDistance(handPosition, 2, "right", numberPosition);

        assertEquals(position, "L");
        assertEquals(position2, "R");
        assertEquals(position3, "R");
    }

    @Test
    void updateHandPostion() {
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

        Solution solution = new Solution();

        solution.updateHandPosition(handPosition, "L", "2 3");

        assertEquals(handPosition.get("L"), "2 3");
    }
}
