import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int list_num = Integer.parseInt(st.nextToken());
        int quest_num = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> poke_map_name = new HashMap<>();
        HashMap<String, Integer> poke_map_index = new HashMap<>();

        for(int i = 0; i < list_num; i++){
            String poke = br.readLine();
            poke_map_name.put(i, poke);
            poke_map_index.put(poke, i);
        }

        for(int j = 0; j < quest_num; j++){
            String quest = br.readLine();
            if(isNumeric(quest)){
                // 숫자
                bw.write((poke_map_name.get(Integer.parseInt(quest) - 1)) + "\n");
            } else {
                // 문자
                bw.write(((poke_map_index.get(quest) + 1)) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}


