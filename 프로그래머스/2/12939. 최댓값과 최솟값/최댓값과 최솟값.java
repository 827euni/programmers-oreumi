class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] result = new int[arr.length];
        int min = 999999;
        int max = -99999;
        for (int i = 0; i<arr.length; i++){
            result[i] = Integer.parseInt(arr[i]);
        }
        
        for (int n : result){
            if (n < min){
                min = n;
            }
            if (n>max){
                max = n;
            }
        }
        
        String answer = min + " " + max;
        
        return answer;
    }
}