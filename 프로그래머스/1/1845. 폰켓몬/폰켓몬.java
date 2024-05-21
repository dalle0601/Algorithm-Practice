import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int choiceNum = nums.length / 2;
        HashSet<Integer> poketmonType = new HashSet<>(); 
        for(int type : nums) {
            poketmonType.add(type);
        }
        
        if(poketmonType.size() >= choiceNum){
            return choiceNum;
        } else {
            return poketmonType.size();
        }
    }
}