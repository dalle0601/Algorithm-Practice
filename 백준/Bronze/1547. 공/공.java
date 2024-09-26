import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int num = 1;
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int one =Integer.parseInt(st.nextToken());
			int other =Integer.parseInt(st.nextToken());
			if(one == num) {
				num = other;
			}else if(other == num){
				num = one;
			}
		}
		System.out.println(num);
	}

}