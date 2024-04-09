import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputValue = Integer.parseInt(br.readLine());
        HashSet<Integer> listS = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < inputValue; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            int values = 0;
            switch(command) {
                case "add":
                    values = Integer.parseInt(st.nextToken());
                    listS.add(values);
                    break;
                case "remove":
                    values = Integer.parseInt(st.nextToken());
                    listS.remove(values);
                    break;
                case "check":
                    values = Integer.parseInt(st.nextToken());
                    sb.append(listS.contains(values)? "1":"0").append('\n');
                    break;
                case "toggle":
                    values = Integer.parseInt(st.nextToken());
                    if(listS.contains(values)) {
                        listS.remove(values);
                    }else {
                        listS.add(values);
                    }
                    break;
                case "all":
                    listS.clear();
                    for(int j = 1; j <= 20; j++)
                        listS.add(j);
                    break;
                case "empty":
                    listS.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
}