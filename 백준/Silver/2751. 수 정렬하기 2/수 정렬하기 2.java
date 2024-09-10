import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < input; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        br.close();

        Collections.sort(list);

        for(int i : list){
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}