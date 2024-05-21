import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothesMap = new HashMap<>();

        for(String[] clothesArr : clothes ){
            String key = clothesArr[1];
            clothesMap.put(key, clothesMap.getOrDefault(key, 0) + 1);
        }
        Iterator<Integer> clothesValue = clothesMap.values().iterator();

        while(clothesValue.hasNext())
        {
            answer *= clothesValue.next().intValue() + 1;
        }
        return answer - 1;
    }
}