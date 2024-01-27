class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String first = Integer.toString(a) + Integer.toString(b);
        String second = Integer.toString(b) + Integer.toString(a);
         
        if (Integer.parseInt(first) > Integer.parseInt(second)) {
            answer = Integer.parseInt(first);
        } 
        else {
            answer = Integer.parseInt(second);
        }
        return answer;
    }
}