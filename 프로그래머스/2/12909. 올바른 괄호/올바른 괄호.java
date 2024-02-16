import java.util.Stack;

public class Parentheses {
    private char sen;
    
    public Parentheses(char sen){
        this.sen = sen;
    }
    
    public char getSen(){
        return sen;
    }
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Parentheses> parentheses = new Stack<>();
        
        for (char c : s.toCharArray()){
            if (c=='('){
                parentheses.push(new Parentheses(c));
            }
            else if(c==')'){
                if (parentheses.isEmpty() || parentheses.pop().getSen() != '(') {
                    return false;
                }
            }
        }
        if (!parentheses.isEmpty()){
            answer = false;
        }
        return answer;
    }
}