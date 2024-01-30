class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int count = 0;

        
        for (int h : array) {
            if (h>height){
                count++;
            }
            
        }
        return count;
    }
}