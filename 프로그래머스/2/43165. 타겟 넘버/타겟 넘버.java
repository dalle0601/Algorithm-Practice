import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Stack<int[]> st = new Stack<>();
        st.push(new int[]{0, 0});

        int[] stPop = st.pop();
            int idx = stPop[0];
            int total = stPop[1];
        System.out.println(idx);
            System.out.println(total);
//         while(!st.isEmpty()) {
//             int[] stPop = st.pop();
//             int idx = stPop[0];
//             int total = stPop[1];

//             if(idx == numbers.length - 1){
//                 if(total == target) {
//                     answer += 1;
//                     continue;
//                 }
//             }
//             st.push(new int[]{idx + 1, total + numbers[idx]});
//             st.push(new int[]{idx + 1, total - numbers[idx]});
//         }
        return answer;
    }
}