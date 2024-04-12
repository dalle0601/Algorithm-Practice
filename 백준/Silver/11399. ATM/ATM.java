import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        StringTokenizer stList = new StringTokenizer(br.readLine(), " ");
        List<Integer> personTime = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int K = Integer.parseInt(stList.nextToken());
            personTime.add(K);
        }

        Collections.sort(personTime);

        int totalTime = 0;
        int waitingTime = 0;
        for(int atm : personTime){
            totalTime += atm + waitingTime;
            waitingTime += atm;
        }

        bw.write(Integer.toString(totalTime));

        br.close();
        bw.flush();
        bw.close();
    }
}