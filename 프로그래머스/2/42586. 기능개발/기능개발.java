import java.util.*;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            int workDay  = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0){
                workDay += 1;
            }
            queue.offer(workDay);
        }
        
        int deployFeat = 1;
        int workingDays = queue.poll();
        while(!queue.isEmpty()){
            if (workingDays >= queue.peek()){
                deployFeat += 1;
                queue.poll();
            } else {
                answer.add(deployFeat);
                workingDays = queue.poll();
                deployFeat = 1;
            }
        }
        answer.add(deployFeat);
        
        return answer;
    }
}