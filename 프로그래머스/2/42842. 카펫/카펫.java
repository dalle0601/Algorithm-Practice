class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int y = 3;
        while (true) {
            if((brown + yellow) % y == 0){
                int x = (brown + yellow) / y;
                
                if( (y-2) * (x-2) == yellow) {
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
            y += 1;
        }
        return answer;
    }
}