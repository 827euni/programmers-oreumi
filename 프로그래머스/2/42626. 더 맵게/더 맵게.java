import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int[] scoville, int K) {
         PriorityQueue<Integer> meal = new PriorityQueue<>();
        
        for (int q : scoville) {
            meal.add(q);
        }
        
        int mix = 0;
        
        while (meal.size() > 1) {
            
            int first = meal.poll();
            int second = meal.poll();
            
            int newSco = first + (second * 2);
            meal.add(newSco);
            mix++;
        }
        
        if (meal.size() == 1 && meal.peek() >= K) {
            return -1;
        }
        
        return mix;
    }
}
