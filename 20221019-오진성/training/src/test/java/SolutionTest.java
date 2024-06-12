import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void solution() {
        Solution solution = new Solution();
        int hi = solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});

        assertEquals(hi, 5);

        int hi2 = solution.solution(10, new int[]{1,2, 4, 5, 6, 9}, new int[]{1, 2, 3, 5, 7, 8,9,10});

        assertEquals(hi2, 10);

//        int hi3 = solution.solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
//
//        assertEquals(hi, 5);
    }
}