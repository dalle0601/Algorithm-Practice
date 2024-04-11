import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        Set<String> set = new HashSet<>();
        List<String> duplicate = new ArrayList<>();
        for(int i = 0; i < N; i++){
            String noneListen = br.readLine();
            set.add(noneListen);
        }

        for(int j = 0; j < M; j++){
            String noneSee = br.readLine();
            if(set.contains(noneSee)){
                duplicate.add(noneSee);
            }
        }

        bw.write(duplicate.size() + "\n");
        Collections.sort(duplicate);
        for (String s : duplicate) {
            bw.write(s + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}