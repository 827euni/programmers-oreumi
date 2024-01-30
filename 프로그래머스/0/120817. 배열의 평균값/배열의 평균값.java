class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        for (int n : numbers){
            sum += n;
        }
        
        answer = (double) sum / numbers.length;
        return answer;
    }
}