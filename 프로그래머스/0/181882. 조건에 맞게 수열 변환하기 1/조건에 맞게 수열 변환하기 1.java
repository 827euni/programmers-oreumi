class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];
        for (int i=0; i<n;i++){
            if(arr[i]>=50 && arr[i]%2 ==0){
                answer[i] = arr[i]/2;
            }
            else if (arr[i]<50 && arr[i]%2 !=0){
                answer[i] = arr[i]*2;
            }
            else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}