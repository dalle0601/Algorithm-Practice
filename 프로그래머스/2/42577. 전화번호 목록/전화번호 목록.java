import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
//         # 1. 2중 Loop 사용
//         Arrays.sort(phone_book, (String s1, String s2) -> s1.length() - s2.length());
        
//         for (int i = 0; i < phone_book.length - 1; i++) {
//             for(int j = i + 1; j < phone_book.length; j++){
//                 if (phone_book[j].startsWith(phone_book[i])) {
//                     return false;
//                 }    
//             }
//         }

//         # 2. hash 사용
        Set<String> set = new HashSet<>();

        for (String phone : phone_book) {
            set.add(phone);
        }
        
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}