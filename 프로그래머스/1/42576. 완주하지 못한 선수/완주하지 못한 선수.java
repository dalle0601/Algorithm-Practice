import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> runners = new HashMap<>();
        
        for(String runner : participant) {
            runners.put(runner, runners.getOrDefault(runner, 0) + 1);
        }
        
        for(String finishedRunner : completion) {
            runners.put(finishedRunner, runners.get(finishedRunner) - 1);
        }
        
        Iterator<Map.Entry<String, Integer>> iter = runners.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}