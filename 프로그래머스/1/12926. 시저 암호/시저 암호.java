class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] sString = s.toCharArray();
        int[] arr = new int[s.length()];
        StringBuilder code = new StringBuilder();
        char alpha;
        for (int i = 0; i < s.length(); i++) {
            arr[i] = sString[i] + n;
            if (sString[i] == ' ') {
                alpha = ' ';
            } else {
                alpha = (char) arr[i];
                if (sString[i] >= 'A' && sString[i] <= 'Z' && alpha > 'Z') {
                    arr[i] -= 26;
                    alpha = (char) arr[i];
                }
                if (sString[i] >= 'a' && sString[i] <= 'z' && alpha > 'z') {
                    arr[i] -= 26;
                    alpha = (char) arr[i];
                }
            }
            code.append(alpha);
        }
        answer = code.toString();
        return answer;
    }
}
