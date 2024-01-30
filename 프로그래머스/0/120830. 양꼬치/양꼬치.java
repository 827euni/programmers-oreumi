class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int lq = 0;
        
        if (n/10>=1){
            lq = n/10;
        }
        answer = 12000 * n + 2000 * (k-lq);
        return answer;
    }
}