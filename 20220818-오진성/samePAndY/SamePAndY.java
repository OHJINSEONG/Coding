class Solution {
    boolean solution(String s) {
        String S = s.toUpperCase();

        boolean answer = S.chars().filter(value -> 'P' == value).count() == S.chars().filter(value -> 'Y' == value).count();

        return answer;
    }
}
