import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken()) - 1;
        int b = Integer.parseInt(st.nextToken()) - 1;

        int ax = a / 4;
        int ay = a % 4;
        int bx = b / 4;
        int by = b % 4;

        int answer = 0;

        answer += Math.abs(ax - bx);
        answer += Math.abs(ay - by);
        System.out.println(answer);
	}
}