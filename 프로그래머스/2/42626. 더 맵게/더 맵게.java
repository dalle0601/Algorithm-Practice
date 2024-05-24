import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		
		for (int i : scoville) {
            pQueue.add(i);
        }
 
        while (pQueue.peek() < K) {
            if (pQueue.size() <= 1) {
                return -1;
            }
            if (pQueue.peek() >= K) {
                break;
            }
 
            int firstMin = pQueue.poll();
            int secondMin = pQueue.poll();
 
            pQueue.add(firstMin + (secondMin * 2));
            answer++;
        }
        
        return answer;
    }
}