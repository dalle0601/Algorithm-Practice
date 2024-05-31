import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] moveX = {-1, 1, 0, 0};
        int[] moveY = {0, 0, -1, 1};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); 
        maps[0][0] = 0; 
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            if (x == n - 1 && y == m - 1) {
                return distance;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + moveX[i];
                int ny = y + moveY[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if(maps[nx][ny] == 1) {
                        queue.offer(new int[]{nx, ny, distance + 1});
                        maps[nx][ny] = 0; 
                    }
                }
            }
        }
        
        return -1;
    }
}