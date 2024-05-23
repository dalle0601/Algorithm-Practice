import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {        
        Stack<Integer> stack = new Stack<>();
        
        for(int arrValue : arr){
            if(!stack.empty()) {
                if(stack.peek() != arrValue){
                    stack.push(arrValue);
                }
            } else {
                stack.push(arrValue);
            }
        }

        return stack;
    }
}