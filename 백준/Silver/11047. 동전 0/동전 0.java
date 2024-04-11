import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> coin = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int coinValue = Integer.parseInt(br.readLine());
            coin.add(coinValue);
        }

        int count = 0;

        for(int j = N-1; j >= 0; j--){
            if(K >= coin.get(j)){
                count += K / coin.get(j);
                K %= coin.get(j);
            }
        }
        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}