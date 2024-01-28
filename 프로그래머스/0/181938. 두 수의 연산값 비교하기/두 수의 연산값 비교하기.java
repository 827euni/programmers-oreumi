class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ans = Integer.toString(a) + Integer.toString(b);
        answer = Integer.parseInt(ans);
        int result = Math.max(answer, 2*a*b);
        return result;
    }
}